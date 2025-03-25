package Fadhil.Belajar_Java_dasar.Tugas_Discuss;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Scanner untuk input nominal
        Scanner scanner = new Scanner(System.in);

        // Membuat account
        Account account1 = new Account("Fadhil", "23582", 100000);
        Account account2 = new Account("Rafiq", "13053", 50000);

        // Menampilkan saldo awal
        System.out.println("Saldo awal --->");
        System.out.println(account1.getNama() + " = " + account1.getNorek() + ": " + account1.getSaldo());
        System.out.println(account2.getNama() + " = " + account2.getNorek() + ": " + account2.getSaldo());

        // Input nominal transfer
        System.out.print("Masukkan nominal yang ingin ditransfer: ");
        double nominal = scanner.nextDouble();

        // Membuat objek InternalTransfer dan melakukan transaksi
        InternalTransfer transfer = new InternalTransfer();
        transfer.transaksi(account1, account2, nominal);

        scanner.close();
    }
}
