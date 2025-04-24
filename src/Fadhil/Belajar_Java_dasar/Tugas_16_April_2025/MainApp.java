package Fadhil.Belajar_Java_dasar.Tugas_16_April_2025;

// MainApp.java
import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int customerCount;

        System.out.print("Masukkan jumlah pelanggan: ");
        customerCount = scanner.nextInt();

        try {
            if (customerCount < 1) {
                throw new IllegalArgumentException("Jumlah pelanggan harus lebih dari 0");
            }

            // Hanya 3 pelanggan yang bisa dilayani secara bersamaan
            Semaphore semaphore = new Semaphore(3);
            ServiceManager manager = new ServiceManager();

            for (int i = 1; i <= customerCount; i++) {
                Thread t = new Thread(new CustomerHandler(i, semaphore, manager));
                t.start();
            }

        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
