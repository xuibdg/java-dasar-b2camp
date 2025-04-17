package Revi.Belajar_Java_Dasar.Thread;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.Semaphore;

public class ThreadSync implements Runnable {
    private final WaterBottle bottle;
    private final CounterMonitor counter;
    private final ReentrantLock lock;
    private final Semaphore semaphore;
    private final int pengisian;

    public ThreadSync(WaterBottle bottle, CounterMonitor counter, ReentrantLock lock, Semaphore semaphore, int pengisian) {
        this.bottle = bottle;
        this.counter = counter;
        this.lock = lock;
        this.semaphore = semaphore;
        this.pengisian = pengisian;
    }

    @Override
    public void run() {
        for (int i = 0; i < pengisian; i++) {
            try {
                semaphore.acquire();
                lock.lock();
                try {
                    if (bottle.fill("Thread 3")) {
                        counter.increment();
                    }
                } finally {
                    lock.unlock();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                semaphore.release(); // Lepaskan izin setelah selesai
            }

            try {
                Thread.sleep(500); // Tidur selama 1000ms (1 detik)
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Menangani interrupt exception
            }
        }
    }
}