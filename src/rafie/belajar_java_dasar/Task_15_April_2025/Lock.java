package rafie.belajar_java_dasar.Task_15_April_2025;

public class Lock {
    public static void main(String[] args) throws InterruptedException {
        CounterLock counter = new CounterLock();

        Thread thread1 = new Thread(() -> {
            counter.locking();
            for (int i = 0; i < 100; i++) {
                counter.increment();
                System.out.println(counter.getCount() + " thread ke-1 dengan index ke-> " + i);
            }

            counter.unlocking();
        });

        Thread thread2 = new Thread(() -> {
            counter.locking();
            for (int i = 0; i < 100; i++) {
                counter.increment();
                System.out.println(counter.getCount() + " thread ke-2 dengan index ke-> " + i);
            }
            counter.unlocking();
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Hasil getCount : " + counter.getCount());
    }
}
