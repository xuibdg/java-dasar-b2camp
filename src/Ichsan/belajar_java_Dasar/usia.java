package Ichsan.belajar_java_Dasar;
//NO.2 Buat program yang meminta input usia dan menentukan kategorinya menggunakan ternary operator
// bertingkat dengan ketentuan:
//  gunakan scanner agar usia dapat di input

import java.util.Scanner;

public class usia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan Usia: ");
        int usia = scanner.nextInt();
        String kumpulanUsia =
                (usia < 13) ? "Bocil" :
                        (usia <= 17) ? "Remaja" :
                        (usia <= 59) ? "Dewasa" :
                        (usia <= 70) ? "Aki-Aki" : "lansia";
        System.out.println("Kategori Usia: " + kumpulanUsia);
        scanner.close();
    }
}
