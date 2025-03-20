package Revi.Belajar_Java_Dasar;
import java.util.Scanner;

public class Task_19_Maret_No1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Masukan Nilai
        System.out.print("Masukkan nilai: ");
        int nilai = scanner.nextInt(); // Memperbaiki cara membaca input

        // Menentukan kategori nilai
        if (nilai >= 85 && nilai <= 100) {
            System.out.println("A");
        } else if (nilai >= 70) {
            System.out.println("B");
        } else if (nilai >= 55) {
            System.out.println("C");
        } else if (nilai >= 40) {
            System.out.println("D");
        } else if (nilai < 39) {
            System.out.println("E");
        } else {
            System.out.println("Nilai tidak valid!");
        }
        scanner.close();
    }
}