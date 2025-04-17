package Adam.Belajar_Java_dasar.LearnConcurrency;


public class Monitor_Adam {
    public static void main(String[] args) throws InterruptedException {
        MonitorCounter counter = new MonitorCounter();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                counter.increment();
                System.out.println(counter.getCount() + "t1 -> " + i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                counter.increment();
                System.out.println(counter.getCount() + "t1 -> " + i);
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("count = " + counter.getCount());
    }
}
