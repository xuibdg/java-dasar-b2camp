package rio.task_tgl_15_apr;

public class Synchornize_rio {
    public static void main(String[] args) throws InterruptedException {
        CounterSync_rio counterSyncRio = new CounterSync_rio();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                counterSyncRio.increment();
                System.out.println(counterSyncRio.getCount() + " t1 -> " + i);
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                counterSyncRio.increment();
                System.out.println(counterSyncRio.getCount() + " t2 -> " + i);
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Count : " + counterSyncRio.getCount());
    }
}
