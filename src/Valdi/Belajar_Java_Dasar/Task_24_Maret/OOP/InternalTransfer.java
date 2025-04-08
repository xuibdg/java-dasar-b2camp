package Valdi.Belajar_Java_Dasar.Task_24_Maret.OOP;

//3.buat class InternalTransfer (sub class transaction) implementasi ulang sesuai internalTransfer , source di kurang, destination di tambah
//—buat parameter nominal menggunakan scanner, dan gunakan prinsip OOP

public class InternalTransfer extends Transaction{
    @Override //mengimplementasi ulang method abstrak transaksi
    public void transaksi(Account sourceAccount, Account destinasionAccount, double nominal){
        if (sourceAccount.getSaldo() >= nominal){
        sourceAccount.setSaldo(sourceAccount.getSaldo() - nominal);
        destinasionAccount.setSaldo(destinasionAccount.getSaldo() + nominal);
            System.out.println("Transfer berhasil sebesar : Rp " + nominal);
        } else {
            System.out.println("!=====Saldo tidak mencukupi.=====!");
        }
        //sourceAccount rekening yang mengirim
        //destinasionAccount rekening penerima uang
        //nominal jumlah yang dikirim


    }
}
