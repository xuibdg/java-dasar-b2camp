package rafie.belajar_java_dasar.Task_16_April_2025;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Muda berkelana tua bercerita");

        while (true) {
            if(Motor.getTotalMotors() >= 3) {
                System.out.println("Motornya sudah maks");
                break;
            }

            System.out.print("Masukkan nama motor kesayangan Anda: ");
            String inputanUser = scanner.nextLine();

            Motor motorUser = new Motor(inputanUser);
            motorUser.run();
            try {
                motorUser.join();
                Thread.sleep(2800);
            } catch (InterruptedException e) {
                System.out.println("Error di main thread!");
            }
        }
        scanner.close();
    }
}