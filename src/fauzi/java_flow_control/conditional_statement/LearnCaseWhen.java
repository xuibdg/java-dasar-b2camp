package fauzi.java_flow_control.conditional_statement;

import java.util.Scanner;

public class LearnCaseWhen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("masukan hari ke berapa yang mau di validasi : ");
        int day = scanner.nextInt();

        switch (day){
            case 6:
                System.out.println("senin");
                if (day > 5){
                    System.out.println("pake baju renang");
                }
                break;
            case 7:
                System.out.println("selasa");
                break;
            case 8:
                System.out.println("rabu");
                break;
            default:
                System.out.println("hari tidak valid");
        }

        scanner.close();
    }
}
