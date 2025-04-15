package fauzi.concurrency;

public class MonitorExample {
    public static void main(String[] args) throws InterruptedException {
        CounterMonitor counter = new CounterMonitor();

        //AtomicInteger number = new AtomicInteger();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                counter.increment();
                System.out.println(counter.getCount() + " t1 -> " + i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                counter.increment();
                System.out.println(counter.getCount() + " t2 -> " + i);
            }
        });


        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("count = " + counter.getCount());
        //System.out.println("number = " + number);


    }
}
