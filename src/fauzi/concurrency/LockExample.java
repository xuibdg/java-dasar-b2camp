package fauzi.concurrency;

public class LockExample {
    public static void main(String[] args) throws InterruptedException {
        CounterLock counter = new CounterLock();

        Thread thread1 = new Thread(() -> {
            counter.locking();
            for (int i = 0; i < 100; i++) {
                counter.increment();
                System.out.println(counter.getCount() + " t1 -> " + i);
            }

            counter.unlocking();
        });

        Thread thread2 = new Thread(() -> {
            counter.locking();
            for (int i = 0; i < 100; i++) {
                counter.increment();
                System.out.println(counter.getCount() + " t2 -> " + i);
            }
            counter.unlocking();
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("total count = " + counter.getCount());

    }

}
