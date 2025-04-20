package rafie.belajar_java_dasar.Task_15_April_2025;

public class Monitor {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                counter.increment();
                System.out.println(counter.getCount() + " thread ke-1 dengan index ke -> " + i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                counter.increment();
                System.out.println(counter.getCount() + " thread ke-2 dengan index ke -> " + i);
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Method getCount dengan hasil akhirnya adalah: " + counter.getCount());
    }
}
