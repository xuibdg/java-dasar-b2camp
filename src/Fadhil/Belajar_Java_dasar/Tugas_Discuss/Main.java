package Fadhil.Belajar_Java_dasar.Tugas_Discuss;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat account
        Account account1 = new Account("Fadhil", "23512382", 200000);
        Account account2 = new Account("Rafiq", "13059873", 10000);

        // Menampilkan saldo awal
        System.out.println("SALDO AWAL --->");
        System.out.println(account1.getNama() + " = " + account1.getNorek() + "  : Rp." + account1.getSaldo());
        System.out.println("-------------------------------");
        System.out.println(account2.getNama() + " = " + account2.getNorek() + ": Rp." + account2.getSaldo());

        // Input nominal transfer
        System.out.print("Masukkan nominal yang ingin ditransfer: ");
        double nominal = scanner.nextDouble();

        InternalTransfer transfer = new InternalTransfer();
        transfer.transaksi(account1, account2, nominal);

    }
}
