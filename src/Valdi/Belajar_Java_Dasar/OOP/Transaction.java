package Valdi.Belajar_Java_Dasar.OOP;

//2.buat class Transaction (super class), di dlmnya ada metode transaksi
//Yang dimana di cuman punya parameter “sourceAccount,destinationAccount,nominal”

public abstract class Transaction {

    public void transaksi (Account sourceAccount, Account destinasionAccount, double nominal){
        System.out.println("Transaksi Sedang di proses...");
        //sourceAccount akun transaksi
        //destinasionAccount akun tujuan transaksi
        //nominal jumlah yang di transfer

    }
}