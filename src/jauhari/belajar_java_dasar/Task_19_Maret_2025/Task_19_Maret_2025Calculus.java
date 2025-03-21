package jauhari.belajar_java_dasar.Task_19_Maret_2025;

import java.util.Scanner;

public class Task_19_Maret_2025Calculus {
    public static void main(String[] args) {
        System.out.println("Task no 3 Mini Artimatic Operations");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Input operator (+. -, *, /, %, ^): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Input second number: ");
        double number2 = scanner.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.println("result: " + result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println("result: " + result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println("result: " + result);
                break;
            case '/':
                if (number2 != 0) {
                    result = number1 / number2;
                    System.out.println("result: " + result);
                } else {
                    System.out.println("Undefined value");
                }
                break;
            case '%':
                if (number2 != 0) {
                    result = number1 % number2;
                    System.out.println("result: " + result);
                } else {
                    System.out.println("Error, Sorry I can't help you. I'm Just a Mini Calculator :(");
                }
                break;
            case '^':
                result = Math.pow(number1,number2);
                System.out.println("result: " + result);
                break;
            default:
                System.out.println("Error, cannot doing the operations, please select the right operations!");
            scanner.close();
        }
        System.out.println("====irahuaJ Calculators====");
    }
}
