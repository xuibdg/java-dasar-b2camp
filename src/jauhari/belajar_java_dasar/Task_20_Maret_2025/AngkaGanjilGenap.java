package jauhari.belajar_java_dasar.Task_20_Maret_2025;

import java.util.Scanner;

public class AngkaGanjilGenap {
    public static void main(String[] args) {
        System.out.println("Print Odd and Even Number");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Number: ");
        int number = scanner.nextInt();

        System.out.print("Even number: [ ");
        for (int i = 0; i <= number; i++)
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        System.out.println("]");

        System.out.print("Odd number: [ ");
        for (int i = 0; i <= number; i++)
            if (i % 2 != 0) {
            System.out.print(i + " ");
            }
        System.out.println("]");
        scanner.close();
         }
    }