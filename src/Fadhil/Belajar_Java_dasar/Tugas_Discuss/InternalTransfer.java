package Fadhil.Belajar_Java_dasar.Tugas_Discuss;

import java.util.Scanner;

public class InternalTransfer extends Transaction {

    @Override
    public void transaksi(Account sourceAccount, Account destinationAccount, double nominal) {
        super.transaksi(sourceAccount,destinationAccount,nominal);
        // Implementasi atau proses transfer : source dikurangi, destination ditambah
        if (sourceAccount.getSaldo() >= nominal) {
            sourceAccount.setSaldo(sourceAccount.getSaldo() - nominal);
            destinationAccount.setSaldo(destinationAccount.getSaldo() + nominal);
            System.out.println("TRANFER BERHASIL!");
            System.out.println("Saldo Fadhil dengan no rekening " + sourceAccount.getNorek() + " = Rp." + sourceAccount.getSaldo());
            System.out.println("---------------------------------------");
            System.out.println("Saldo Rafiq dengan no rekening " + destinationAccount.getNorek() + " = Rp." + destinationAccount.getSaldo());
        } else {
            System.out.println("Saldo tidak cukup untuk transfer.");
        }
    }
}

