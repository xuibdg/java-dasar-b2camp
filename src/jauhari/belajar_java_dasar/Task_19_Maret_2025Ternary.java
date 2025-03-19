package jauhari.belajar_java_dasar;

import java.util.Scanner;

public class Task_19_Maret_2025Ternary {
    public static void main(String[] args) {
        System.out.println("Task no 2 Ternary Age Category");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Age: ");
        int age = scanner.nextInt();

        String category = (age >= 60) ? "Eldery" : (age >= 18) ? "Mature" : (age >= 13) ? "Teenager" : "Child";
        System.out.println("Age Category: " + category);
        scanner.close();
    }
}
