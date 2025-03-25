package Fadhil.Belajar_Java_dasar.Tugas_Discuss;

import java.util.Scanner;

public class InternalTransfer extends Transaction {

    @Override
    public void transaksi(Account sourceAccount, Account destinationAccount, double nominal) {
        super.transaksi(sourceAccount,destinationAccount,nominal);
        // Implementasi untuk transfer internal: source dikurangi, destination ditambah
        if (sourceAccount.getSaldo() >= nominal) {
            sourceAccount.setSaldo(sourceAccount.getSaldo() - nominal);
            destinationAccount.setSaldo(destinationAccount.getSaldo() + nominal);
            System.out.println("Transfer internal berhasil!");
            System.out.println("Saldo setelah transfer --->");
            System.out.println("Saldo Fadhil dengan no rekening " + sourceAccount.getNorek() + " menjadi = " + sourceAccount.getSaldo());
            System.out.println("Saldo Rafiq dengan no rekening " + destinationAccount.getNorek() + " menjadi = " + destinationAccount.getSaldo());
        } else {
            System.out.println("Saldo tidak cukup untuk transfer.");
        }
    }
}

