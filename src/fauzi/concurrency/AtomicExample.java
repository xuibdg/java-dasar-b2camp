package fauzi.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {
    public static void main(String[] args) throws InterruptedException {


        AtomicInteger atomicInteger = new AtomicInteger(0);
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                atomicInteger.getAndIncrement();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                atomicInteger.getAndIncrement();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Atomic count : " + atomicInteger.get());
    }
}
