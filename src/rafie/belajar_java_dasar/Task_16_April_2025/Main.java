package rafie.belajar_java_dasar.Task_16_April_2025;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Muda berkelana tua bercerita");
        System.out.println("Masukkan nama motor kesayangan Anda (ketik 'stop' untuk selesai):");

        while (true) {
            System.out.print("Nama motor: ");
            String inputanUser = scanner.nextLine();

            if (inputanUser.equalsIgnoreCase("stop")) {
                break;
            }

            Motor motorUser = new Motor(inputanUser);
            motorUser.start();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.out.println("Error di main thread!");
            }
        }
        scanner.close();
        System.out.println("Simulasi touring selesai!");
    }
}