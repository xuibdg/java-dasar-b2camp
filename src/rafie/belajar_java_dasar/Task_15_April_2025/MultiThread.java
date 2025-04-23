package rafie.belajar_java_dasar.Task_15_April_2025;

import java.util.Scanner;

public class MultiThread {

    public static void main(String[] args) throws InterruptedException{

    Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan bilangan pertama pilihan Anda: ");
        int bilPertama = scanner.nextInt();

        System.out.print("Masukan bilangan kedua pilihan Anda: ");
        int bilKedua = scanner.nextInt();

        Thread threadBilPertama = new Thread(() -> {
            for (int i = 1; i <= bilPertama; i++) {
                System.out.print("Bilangan pertama Anda: " + i);
                System.out.println("\n");
            }
        });

        Thread threadBilKedua = new Thread(() -> {
            for (int i = 1; i <= bilKedua; i++) {
                System.out.print("Bilangan kedua Anda: " + i);
                System.out.println("\n");
            }
        });

        threadBilPertama.start();
        threadBilKedua.start();

        threadBilPertama.join();
        threadBilKedua.join();
    }
}
