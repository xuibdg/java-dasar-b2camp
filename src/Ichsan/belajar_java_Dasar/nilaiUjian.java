package Ichsan.belajar_java_Dasar;

import java.util.Scanner;

public class nilaiUjian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nilai Ujian: ");
        int n = scanner.nextInt();
       if (n >= 85) {
            System.out.println("Nilai = 'A'");
        }
       else if (n >= 70) {
            System.out.println("Nilai = 'B'");
        }
        else if (n == 55) {
            System.out.println("Nilai = 'C'");
        }
        else if (n == 40) {
            System.out.println("Nilai = 'D'");
        }
        else {
            System.out.println("Nilai = 'F'");
        }
    }
}


