package Revi.Belajar_Java_Dasar.Thread;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.Semaphore;
import java.util.Scanner;

public class MultiThread {
    public static void main(String[] args) throws InterruptedException {
        WaterBottle bottle = new WaterBottle();
        CounterMonitor counter = new CounterMonitor();
        ReentrantLock lock = new ReentrantLock();


        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah pengisian yang diinginkan: ");
        int pengisian = scanner.nextInt();


        Semaphore semaphore = new Semaphore(2);


        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    semaphore.acquire();
                    lock.lock();
                    try {
                        if (bottle.fill("Thread 1")) {
                            counter.increment();
                        }
                    } finally {
                        lock.unlock();
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {
                    semaphore.release();
                }

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    semaphore.acquire();
                    lock.lock();
                    try {
                        if (bottle.fill("Thread 2")) {
                            counter.increment();
                        }
                    } finally {
                        lock.unlock();
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {
                    semaphore.release();
                }

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        // Thread 3 lewat ThreadSync
        Thread t3 = new Thread(new ThreadSync(bottle, counter, lock, semaphore, pengisian));


        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
        t3.join();

        synchronized (System.out) {
            System.out.println("Total isi air berhasil: " + counter.getCount() + " kali");
            System.out.println("Total air dalam botol: " + bottle.getLiter() + " liter");
        }
    }
}