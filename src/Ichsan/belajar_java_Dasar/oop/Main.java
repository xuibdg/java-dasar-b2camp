package Ichsan.belajar_java_Dasar.oop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //untuk input pengguna
        Scanner scanner =new Scanner(System.in);

        //membuat akun ke Account_I
        Account_I akunke1 = new Account_I("Ronaldo", "34263452465", 100000 );
        Account_I akunke2 = new Account_I("Messi", "653414151" ,  200000);

        //menampilkan informasi akun sebelum transaksi
        System.out.println("|Akun Pengirim|");
         System.out.println("Nama: " + akunke1.getNama());
         System.out.println("Norek: " + akunke1.getNorek());
         System.out.println("Saldo: " + akunke1.getSaldo());
        System.out.println("======================");
         //menampilkan informasi akun sesudah transaksi
        System.out.println("|Akun Penerima|");
        System.out.println("Nama: " + akunke2.getNama());
        System.out.println("Norek: " + akunke2.getNorek());
        System.out.println("Saldo: " + akunke2.getSaldo());

        System.out.println("Masukan Jumlah Transfer: $ ");
        double nominal = scanner.nextDouble();

        //poses transakasi
        InternalTransfer transaction = new InternalTransfer();
        transaction.transaksi(akunke1,akunke2,nominal);
        //menampilkan kedua akun setelah transaksi
        System.out.println("Akun Pengirim");
        System.out.println("Nama: " + akunke1.getNama());
        System.out.println("Norek: " + akunke1.getNorek());
        System.out.println("Saldo: " + akunke1.getSaldo());
        System.out.println("=====================");
        System.out.println("Akun Penerima");
        System.out.println("Nama: " + akunke2.getNama());
        System.out.println("Norek: " + akunke2.getNorek());
        System.out.println("Saldo: " + akunke2.getSaldo());


        scanner.close();
    }
}
