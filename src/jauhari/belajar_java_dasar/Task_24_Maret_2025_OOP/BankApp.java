package jauhari.belajar_java_dasar.Task_24_Maret_2025_OOP;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Account akun1 = new Account("Jau", "210196", 2100000);
        Account akun2 = new Account("Hari", "691012", 1900000);

        System.out.println("Pengirim :" + akun1.getNama() + " (Rek: " + akun1.getNoRek() + ") " + "Saldo awal: Rp " + akun1.getSaldo());
        System.out.println("Penerima :" + akun2.getNama() + " (Rek: " + akun2.getNoRek() + ") " + "Saldo awal: Rp " + akun2.getSaldo());

        System.out.print("Silakan masukan nominal transfer: ");
        double jumlah = scanner.nextDouble();

        InternalTransfer transfer = new InternalTransfer();
        transfer.transfer(akun1,akun2,jumlah);

        System.out.println( "Saldo setelah transfer :");
        System.out.println(akun1.getNama() + " (Rek: " + akun1.getNoRek() + ") " + "Saldo akhir: Rp " + akun1.getSaldo());
        System.out.println(akun2.getNama() + " (Rek: " + akun2.getNoRek() + ") " + "Saldo akhir: Rp " + akun2.getSaldo());

        scanner.close();
    }
}
