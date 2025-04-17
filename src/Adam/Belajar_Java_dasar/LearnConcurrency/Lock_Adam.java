package Adam.Belajar_Java_dasar.LearnConcurrency;

public class Lock_Adam {
    public static void main(String[] args) throws InterruptedException {
        LockCounter counter = new LockCounter();

        Thread thread1 = new Thread(() -> {
            counter.locking();
            for (int i = 0; i < 50; i++) {
                counter.increment();
                System.out.println(counter.getCount() + "t1 -> " + " " + i);
            }
            counter.unlocking();
        });

        Thread thread2 = new Thread(() -> {
            counter.locking();
            for (int i = 0; i < 50; i++) {
                counter.increment();
                System.out.println(counter.getCount() + "t1 -> " + " " + i);
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
