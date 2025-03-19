package Ichsan.belajar_java_Dasar;

import java.util.Scanner;

public class usia {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Masukan Usia: ");
     int usia =scanner.nextInt();
     String  kumpulanUsia=(usia < 13) ? "Bocil": (usia <= 17) ? "Remaja" : (usia <= 59) ? "Dewasa":
             (usia <= 60) ? "Aki-Aki" : "lansia";
        System.out.println("Kategori Usia: " + kumpulanUsia );
        scanner.close();
    }
}
