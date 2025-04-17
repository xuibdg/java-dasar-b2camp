package rio.task_tgl_15_apr;

public class Multithread_rio {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("List ke 1 : " + i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("List ke 2 : " + i);
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}
