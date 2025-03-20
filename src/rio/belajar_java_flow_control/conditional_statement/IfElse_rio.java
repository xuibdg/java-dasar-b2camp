package rio.belajar_java_flow_control.conditional_statement;

import java.util.Scanner;

public class IfElse_rio {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai ujian (0-100): ");
        int nilai = scanner.nextInt();

        if (nilai >= 85) {
            System.out.println("Kategori: A");
        } else if (nilai >= 70) {
            System.out.println("Kategori: B");
        } else if (nilai >= 55) {
            System.out.println("Kategori: C");
        } else if (nilai >= 40) {
            System.out.println("Kategori: D");
        } else {
            System.out.println("Kategori: E");
        }
        scanner.close();
    }
}