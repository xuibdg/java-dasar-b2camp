package Valdi.Belajar_Java_Dasar.Task_19_Maret;

import java.util.Scanner;

public class nilai {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in); // Membuat objek Scanner

            // Meminta input dari pengguna
            System.out.print("Masukkan nilai ujian (0-100): ");
            int nilai = scanner.nextInt();

            // Menentukan kategori nilai
            String kategori;
            if (nilai >= 85 && nilai <= 100) {
                kategori = "A";
            } else if (nilai >= 70) {
                kategori = "B";
            } else if (nilai >= 55) {
                kategori = "C";
            } else if (nilai >= 40) {
                kategori = "D";
            } else if (nilai >= 0) {
                kategori = "E";
            } else {
                kategori = "Nilai tidak valid!";
            }

            // Menampilkan hasil
            System.out.println("Kategori nilai: " + kategori);

            scanner.close(); // Menutup Scanner
        }
    }
