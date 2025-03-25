package Fadhil.Belajar_Java_dasar.Tugas_Discuss;

public class Transaction {
    // Metode transaksi
    public void transaksi(Account sourceAccount, Account destinationAccount, double nominal) {
        // Di sini bisa diimplementasikan transaksi umum
        System.out.println("Transaksi antara no rekening = " + sourceAccount.getNorek() + " dan " + destinationAccount.getNorek());
        System.out.println("Nominal saldo = " + nominal);
    }
}
