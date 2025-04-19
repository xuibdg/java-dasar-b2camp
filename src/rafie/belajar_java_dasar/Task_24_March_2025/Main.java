package rafie.belajar_java_dasar.Task_24_March_2025;

// Main.java sebagai PSVM.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scannerInputan = new Scanner(System.in);

        System.out.print("Masukkan nama pengirim: ");
        String senderName = scannerInputan.nextLine();

        System.out.print("Masukkan nomor rekening pengirim: ");
        int rekeningSender = scannerInputan.nextInt();

        System.out.print("Masukkan saldo awal pengirim: ");
        int senderMoney = scannerInputan.nextInt();

        Account senderAccounts = new Account(senderName, rekeningSender, senderMoney);

        scannerInputan.nextLine();
        System.out.print("Masukkan nama penerima: ");
        String receiverName = scannerInputan.nextLine();

        System.out.print("Masukkan nomor rekening penerima: ");
        int rekeningReceiver = scannerInputan.nextInt();

        System.out.print("Masukkan saldo awal penerima: ");
        int receiverMoney = scannerInputan.nextInt();

        Account receiverAccounts = new Account(receiverName, rekeningReceiver, receiverMoney);

        System.out.print("Masukkan nominal transfer: " );
        int nominal = scannerInputan.nextInt();

        Transaction transaksiBaru = new Transaction();
        transaksiBaru.transaksi(senderAccounts, receiverAccounts, nominal);

        System.out.println("SEBELUM");
        senderAccounts.showDetails();
        receiverAccounts.showDetails();

        InternalTransfer internalTransferBaru = new InternalTransfer();
        internalTransferBaru.transaksi(senderAccounts, receiverAccounts, nominal);

        System.out.println("\nSESUDAH");
        senderAccounts.showDetails();
        receiverAccounts.showDetails();

    }
}
