package jauhari.belajar_java_dasar.Task_19_Maret_2025;

import java.util.Scanner;

public class Task_19_Maret_2025IfElse {
    public static void main(String[] args) {
        System.out.println("Task no 1 Kategori Nilai");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan Nilai: ");
        double nilai = scanner.nextDouble();
        if (nilai >= 85.00) {
            System.out.println("Nilai : A");
        } else if (nilai >= 70.00) {
            System.out.println("Nilai : B");
        } else if (nilai >= 55.00) {
            System.out.println("Nilai : C");
        } else if (nilai >= 40.00) {
            System.out.println("Nilai : D");
        } else
            System.out.println("Nilai : E");
        scanner.close();
    }
}

