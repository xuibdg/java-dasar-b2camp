package Ichsan.belajar_java_Dasar.oop;

//3.buat class InternalTransfer (sub class transaction) implementasi ulang sesuai internalTransfer ,
// source di kurang, destination di tambah
//—buat parameter nominal menggunakan scanner, dan gunakan prinsip OOP

public class InternalTransfer extends Transaction{

    //InternalTransfe subclass dari Transaction
    @Override
    public void transaksi(Account_I sourceAccunt_I, Account_I destinationAccount_I, double nominal) {
        //cek apakah saldo pengirim cukup,
        if(sourceAccunt_I.getSaldo() >=nominal){
            sourceAccunt_I.setSaldo(sourceAccunt_I.getSaldo() - nominal);
            destinationAccount_I.setSaldo(destinationAccount_I.getSaldo() + nominal);
            System.out.println("Transaksi Berhasil : ");
            //jika cukup maka
            //Mengurangi saldo dari akun pengirim (sourceAccount_I).
            //Menambahkan saldo ke akun penerima (destinationAccount_I).
            //Menampilkan pesan "Transaksi Berhasil".
        }else {
            System.out.println("Transaksi Gagal...");
            //jika saldo pengirrim tidak cukup
        }
    }
}
