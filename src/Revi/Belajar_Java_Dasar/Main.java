package Revi.Belajar_Java_Dasar;

import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Account akun1 = new Account("Aang", "20002000", 100000);
        Account akun2 = new Account("UUNG", "30003000", 400000);

        System.out.println("Sebelum transaksi:");
        System.out.println("Saldo " + akun1.getNama() + ": " + akun1.getSaldo());
        System.out.println("Saldo " + akun2.getNama() + ": " + akun2.getSaldo());

        System.out.print("Masukkan jumlah transfer: ");
        double nominal = scanner.nextDouble();

        InternalTransfer transfer = new InternalTransfer();
        transfer.transaksi(akun1, akun2, nominal);

        System.out.println("Setelah transaksi:");
        System.out.println("Saldo " + akun1.getNama() + ": " + akun1.getSaldo());
        System.out.println("Saldo " + akun2.getNama() + ": " + akun2.getSaldo());

        scanner.close();
    }
}