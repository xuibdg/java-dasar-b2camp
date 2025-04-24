package Valdi.Belajar_Java_Dasar.Task_15_April;


import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class thread {
    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(2);
        Counter counter = new Counter();

        Scanner scanner = new Scanner(System.in);
        System.out.println("masukan jumlah perulangan :");
        int perulangan = scanner.nextInt();

        Thread thread = new Thread(() -> {
//            counter.locking();

                try {
                    semaphore.acquire();
                    for (int i = 0; i < perulangan; i++) {
                        counter.increment();
                        System.out.println("ini running ke : " + counter.getCount() + " dari thread 1 " + i);
                        Thread.sleep(500);
                    }
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    semaphore.release();
            }
//            counter.unlocking();
        });

        Thread thread2 = new Thread(() -> {
//            counter.locking();
            try {
                for (int i = 0; i < perulangan; i++) {
                    counter.increment();
                    System.out.println("ini running ke : " + counter.getCount() + " dari thread 2 " + i);
                    Thread.sleep(500);
                }
            }catch (InterruptedException e) {
            e.printStackTrace();
            }finally {
                semaphore.release();
            }
//            counter.unlocking();
        });
        thread.start();
        thread2.start();
        thread.join();
        thread2.join();

        System.out.println("hasil semua : " + counter.getCount());
    }
}
