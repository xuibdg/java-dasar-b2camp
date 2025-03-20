package Fadhil.Belajar_Java_dasar.Tugas_19_Maret_2025;

import java.util.Scanner;

public class Tugas_19_Maret_2025 {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Masukkan nilai ujian (0-100): ");
//        int nilai = scanner.nextInt();
//
//        if (nilai >= 85) {
//            System.out.println("Kategori: A");
//        } else if (nilai >= 70) {
//            System.out.println("Kategori: B");
//        } else if (nilai >= 55) {
//            System.out.println("Kategori: C");
//        } else if (nilai >= 40) {
//            System.out.println("Kategori: D");
//        } else if (nilai < 40) {
//            System.out.println("Kategori: E");
//        } else {
//            System.out.println("Nilai tidak valid.");
//        }
//
//        scanner.close();

//        Scanner scanner2 = new Scanner(System.in);
//
//        System.out.print("Masukkan usia: ");
//        int usia = scanner2.nextInt();
//
//        String kategori = (usia < 13) ? "Anak-anak" :
//                (usia >= 13 && usia <= 17) ? "Remaja" :
//                        (usia >= 18 && usia <= 59) ? "Dewasa" :
//                                "Lansia";
//
//        System.out.println("Kategori usia: " + kategori);
//
//        scanner2.close();

        Scanner scanner = new Scanner(System.in);

        // Meminta input angka pertama
        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();

        // Meminta input operator
        System.out.print("Masukkan operator (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);

        // Meminta input angka kedua
        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        // Variabel untuk menyimpan hasil
        double hasil = 0;
        boolean valid = true; // Untuk mengecek validitas operator

        // Menggunakan switch-case untuk memilih operasi
        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                } else {
                    valid = false;
                    System.out.println("Error: Pembagian dengan 0 tidak diperbolehkan.");
                }
                break;
            case '%':
                hasil = angka1 % angka2;
                break;
            default:
                valid = false;
                System.out.println("Error: Operator tidak valid.");
                break;
        }

        // Menampilkan hasil jika operator valid
        if (valid) {
            System.out.println("Hasil: " + angka1 + " " + operator + " " + angka2 + " = " + hasil);
        }

        // Menutup scanner setelah selesai
        scanner.close();
   }
}
