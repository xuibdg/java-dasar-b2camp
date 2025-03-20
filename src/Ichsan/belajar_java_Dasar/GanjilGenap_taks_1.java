package Ichsan.belajar_java_Dasar;

import java.util.Scanner;

public class GanjilGenap_taks_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Angka: ");
        int a = 10;
        scanner.nextInt();

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


