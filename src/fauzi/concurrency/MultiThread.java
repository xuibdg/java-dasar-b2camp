package fauzi.concurrency;

public class MultiThread {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("tugas ke 1 :" + i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("tugas ke 2 :" + i);
            }
        });

        thread.start();
        thread2.start();

        thread.join();
        thread2.join();

    }
}
