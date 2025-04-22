package hirlan.concurrency;

public class MultiThread {

    public static void main(String[] args) throws InterruptedException {

        //multithread menjalankan thread dengan acak secara bersamaan
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("pengendalian thread 0 :" + i);
            }
        });

        Thread thread1 = new Thread(()->{
            for (int x =0; x<9; x++){
                System.out.println("pengendalian thread 1 :"+x);
            }
        } );

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("pengendalian thread 2 :" + i);
            }
        });



        thread.start();
        thread1.start();
        thread2.start();

        thread.join();
        thread2.join();

    }
}
