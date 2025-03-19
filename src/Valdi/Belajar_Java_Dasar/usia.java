package Valdi.Belajar_Java_Dasar;

import java.util.Scanner;

public class usia {

     public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in); // Membuat objek Scanner

            // Meminta input usia
            System.out.print("Masukkan usia: ");
            int usia = scanner.nextInt();

            // Menentukan kategori usia dengan ternary operator bertingkat
            String kategori = (usia < 13) ? "Anak-anak" :
                    (usia <= 17) ? "Remaja" :
                            (usia <= 59) ? "Dewasa" : "Lansia";

            // Menampilkan hasil kategori
            System.out.println("Kategori usia: " + kategori);

            scanner.close(); // Menutup Scanner untuk mencegah kebocoran resource
        }
    }
