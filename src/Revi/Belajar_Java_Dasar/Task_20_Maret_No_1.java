package Revi.Belajar_Java_Dasar;

import java.util.Scanner;

public class Task_20_Maret_No_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Angka: ");
        int n =  scanner.nextInt();

        System.out.println("Ganjil:");
        for (int i = 1; i <= n; i += 2) {
            System.out.println(i);
        }

        System.out.println("Genap:");
        for (int i = 2; i <= n; i += 2) {
            System.out.println(i);
        }
        scanner.close();
        }
}


// penjelasan
///