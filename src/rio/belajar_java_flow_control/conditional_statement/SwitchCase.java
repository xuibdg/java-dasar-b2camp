package rio.belajar_java_flow_control.conditional_statement;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        double hasil;

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
                    System.out.println("Error: Pembagian dengan 0 tidak diperbolehkan.");
                }
                break;
            case '%':
                if (angka2 != 0) {
                    hasil = angka1 % angka2;
                    System.out.println("Hasil: " + angka1 + " % " + angka2 + " = " + hasil);
                } else {
                    System.out.println("Error: Modulo dengan 0 tidak diperbolehkan.");
                }
                break;
            default:
                System.out.println("Error: Operator tidak valid.");
        }
        scanner.close();
    }
}

