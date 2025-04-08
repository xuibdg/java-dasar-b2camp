package Ichsan.belajar_java_Dasar.oop;

//2.buat class Transaction (super class), di dlmnya ada metode transaksi
//Yang dimana di cuman punya parameter “sourceAccount,destinationAccount,nominal”
public abstract class Transaction {
    //source akun pengirim
    //destination akun penerima
    //nominal saldo yg akan di kirim
    public void transaksi(Account_I sourceAccunt_I, Account_I destinationAccount_I,double Nominal){
        System.out.println("Transaksi Bejalan...");
    }
}
