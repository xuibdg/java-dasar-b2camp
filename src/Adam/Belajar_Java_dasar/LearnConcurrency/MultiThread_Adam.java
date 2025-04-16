package Adam.Belajar_Java_dasar.LearnConcurrency;

public class MultiThread_Adam {
    public static void main(String[] args) throws InterruptedException{

        Thread thread = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                System.out.println("A : " + i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("B : " + i);
            }
        });

        thread.start();
        thread2.start();


        thread.join();
        thread2.join();


    }

}
