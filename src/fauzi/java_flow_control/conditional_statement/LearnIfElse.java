package fauzi.java_flow_control.conditional_statement;

import java.util.Scanner;

public class LearnIfElse {

    public static void main(String[] args) {

        int i = 6;

        if (i >= 10) {
            if (i <= 5) {
                System.out.println("ayam bakar");
            }
        } else if (i <= 5) {
            System.out.println("risol");
        } else if (i >= 5) {
            System.out.println("ayam");
        } else if (i <= 5) {
            System.out.println("ikan");
        } else if (i == 6) {
            System.out.println("bala-bala");
        } else if (i != 5) {
            System.out.println("gehu");
        } else if (i > 2) {
            System.out.println("pisang goreng");
        } else {
            System.out.println("cireng");
        }


        System.out.println("masukan angka : ");
        Scanner scanner = new Scanner(System.in);
        int u = scanner.nextInt();

        int number = u > 10 ? 0 : 1; //ternary oprator
        System.out.println(number);

        int nomor = u > 10 ? u == 11 ? u > 30 ? 4 : 5 : u > 20 ? 6 : 7 : u < 20 ? 0 : 1; //ternary oprator
        System.out.println("final : " + nomor);

        scanner.close();

    }
}
