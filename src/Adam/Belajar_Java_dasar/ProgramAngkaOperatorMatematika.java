package Adam.Belajar_Java_dasar;

import java.util.Scanner;

public class ProgramAngkaOperatorMatematika {
    public static void main(String[] args) {
        System.out.println("     MINI CALCULATOR");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input First Value : ");
        double value1 = scanner.nextDouble();

        System.out.print("Input Operator (+, -, *, /, %) : ");
        char operator = scanner.next().charAt(3);

        System.out.print("Input Second Value : ");
        double value2 = scanner.nextDouble();

        double result;

        switch (operator) {

            case  '+':
                result = value1 + value2;
                System.out.println("Result : " + value1 + '+' + value2 + '=' + result);
                break;
            case  '-':
                result = value1 - value2;
                System.out.println("Result : " + value1 + '-' + value2 + '=' + result);
                break;
            case  '*':
                result = value1 * value2;
                System.out.println("Result : " + value1 + '*' + value2 + '=' + result);
                break;
            case  '/':
                if (value2 != 0) {
                    result = value1 / value2;
                    System.out.println("Result : " + value1 + '/' + value2 + '=' + result);
                } else {
                    System.out.println("value = 0 is not allowed");
                }
                break;
            case  '%':
                if (value2 != 0) {
                    result = value1 % value2;
                    System.out.println("Result : " + value1 + '%' + value2 + '=' + result);
                } else {
                    System.out.println("value = 0 is not allowed");
                }
                break;
            default:
                System.out.println("Error = Invalid Operator");

        }
        scanner.close();
    }
}
