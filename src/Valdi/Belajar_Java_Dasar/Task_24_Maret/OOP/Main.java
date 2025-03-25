package Valdi.Belajar_Java_Dasar.Task_24_Maret.OOP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //membuat objek scanner agar bisa menginput

        Account akun1 = new Account("Valdi", "123456789", 1000000);
        Account akun2 = new Account("aldo", "987654321", 500000);
        //membuat dua akun ke account

        System.out.println("----------");

        System.out.println("Saldo sebelum di transfer");
        System.out.println("nama : " + akun1.getNama());
        System.out.println("No.Rek : " + akun1.getNorek());
        System.out.println("Saldo : " + akun1.getSaldo());

        System.out.println("----------");

        System.out.println("Saldo sebelum di transfer");
        System.out.println("nama : " + akun2.getNama());
        System.out.println("No.Rek : " + akun2.getNorek());
        System.out.println("Saldo : " + akun2.getSaldo());

        System.out.println("----------");
//        akun2.informasi();
        //menampilkan desail masing" account

        System.out.println("\nMasukan nominal yang akan di transfer : Rp ");
        double nominal = scanner.nextDouble();
        //menggunakan scanner agar bisa di input ke nominal

        InternalTransfer transaction = new InternalTransfer();
        transaction.transaksi(akun1, akun2, nominal);
        //melakukan proses transaksi

        System.out.println("----------");

        System.out.println("Setelah saldo di transfer");
        System.out.println("nama : " + akun1.getNama());
        System.out.println("No.Rek : " + akun1.getNorek());
        System.out.println("Saldo : " + akun1.getSaldo());
        System.out.println("----------");

        System.out.println("Saldo sebelum di transfer");
        System.out.println("nama : " + akun2.getNama());
        System.out.println("No.Rek : " + akun2.getNorek());
        System.out.println("Saldo : " + akun2.getSaldo());

        System.out.println("----------");

//        akun1.informasi();
//        System.out.println("----------");
//        akun2.informasi();
        //menampilkan akun yang sudah di proses

        scanner.close();
    }
}
