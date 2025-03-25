package Ichsan.belajar_java_Dasar;

import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        System.out.println("     Kalkulator");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukan Angka: ");

        double jumlah1=scanner.nextDouble();

        System.out.println("Pilih: +, -, *, /, % ");

        char alat=scanner.next().charAt(0);

        System.out.println("Masukan Angka: ");

        double jumlah2=scanner.nextDouble();

        double hasil;

        switch(alat){
            case '+':
                hasil= jumlah1 + jumlah2;
                System.out.println("Hasil: " + jumlah1 + '+'  + jumlah2 + " = " + hasil );
                break;
            case '*':
                hasil= jumlah1 * jumlah2;
                System.out.println("Hasil: " + jumlah1 + " " + '*' + " " + jumlah2 + " = " + hasil);
                break;
            case '-':
                hasil=jumlah1 - jumlah2;
                System.out.println("Hasil: " + jumlah1 + " " + '-' + " " + jumlah2 + " = " + hasil) ;
                break;
            case '/':
               if(jumlah2 !=0){
                hasil= jumlah1 / jumlah2;
                System.out.println("Hasil: " + jumlah1 + " " + '/' + " " + jumlah2 + " = " + hasil);
                }else{
                    System.out.println("hasil error");}
                break;
            case '%':
                if(jumlah2 !=0) {
                    hasil = jumlah1 % jumlah2;
                System.out.println("Hasil: " + jumlah1 + " " + '%' + " " + jumlah2 + " = " + hasil);
                }else {
                    System.out.println("hasil error");
                    break;
                }
            default:
                System.out.println("System Error 404");
        }
        scanner.close();
    }
}
