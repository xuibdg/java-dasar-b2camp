package fauzi.concurrency;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {

    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(2);

        for (int i = 0; i < 4; i++) {
            Thread thread = new Thread(() -> {
                try {
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName() + " sedang menggunakan printer 1");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } finally {
                    semaphore.release();
                }
            });

            Thread thread2 = new Thread(() -> {
                try {
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName() + " sedang menggunakan printer 2");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } finally {
                    semaphore.release();
                }
            });
            thread.start();
            thread2.start();
        }
    }
}
