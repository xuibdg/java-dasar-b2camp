package Ichsan.belajar_java_Dasar;
//NO. 1 Buatlah program yang mencetak angka ganjil dan genap, masing-masing di baris baru. gunakan scanner
//        Contoh:
//        Masukan angka:10
//        Angka ganjil : [1,3,5,7,9]
//        Angka genap : [2,4,6,8,10]

import java.util.Scanner;

public class GanjilGenap_taks_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Angka: ");
        int a = scanner.nextInt();

        System.out.println("Ganjil");
        for (int i = 1; i <= a; i += 2) {
            System.out.println(i);

        }

        System.out.println("Genap");
        for (int i = 2; i <= a; i += 2) {
            System.out.println(i);

        } scanner.close();
    }
}


