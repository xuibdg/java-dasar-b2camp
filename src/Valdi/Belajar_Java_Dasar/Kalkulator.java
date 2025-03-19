package Valdi.Belajar_Java_Dasar;

import java.util.Scanner;


public class Kalkulator {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Meminta input angka pertama
            System.out.print("Masukkan angka pertama: ");
            double angka1 = scanner.nextDouble();

            // Meminta input operator
            System.out.print("Masukkan operator (+, -, *, /, %): ");
            char operator = scanner.next().charAt(0);

            // Meminta input angka kedua
            System.out.print("Masukkan angka kedua: ");
            double angka2 = scanner.nextDouble();

            double hasil;

            // Menggunakan switch-case untuk operasi matematika
            switch (operator) {
                case '+':
                    hasil = angka1 + angka2;
                    System.out.println("Hasil: " + angka1 + " + " + angka2 + " = " + hasil);
                    break;
                case '-':
                    hasil = angka1 - angka2;
                    System.out.println("Hasil: " + angka1 + " - " + angka2 + " = " + hasil);
                    break;
                case '*':
                    hasil = angka1 * angka2;
                    System.out.println("Hasil: " + angka1 + " * " + angka2 + " = " + hasil);
                    break;
                case '/':
                    if (angka2 != 0) {
                        hasil = angka1 / angka2;
                        System.out.println("Hasil: " + angka1 + " / " + angka2 + " = " + hasil);
                    } else {
                        System.out.println("Error: Pembagian dengan nol tidak diperbolehkan!");
                    }
                    break;
                case '%':
                    if (angka2 != 0) {
                        hasil = angka1 % angka2;
                        System.out.println("Hasil: " + angka1 + " % " + angka2 + " = " + hasil);
                    } else {
                        System.out.println("Error: Modulo dengan nol tidak diperbolehkan!");
                    }
                    break;
                default:
                    System.out.println("Error: Operator tidak valid!");
            }

            //"+" penjumlahan
            //"-" pengurangan
            //"*" perkalian
            //"/" pembagian
            //"%" sisa pembagian


            scanner.close(); // Menutup scanner untuk mencegah kebocoran resource
        }
    }
