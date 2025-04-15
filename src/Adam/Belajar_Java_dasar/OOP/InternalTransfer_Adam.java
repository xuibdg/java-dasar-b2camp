package Adam.Belajar_Java_dasar.OOP;

import java.math.BigDecimal;

public class InternalTransfer_Adam extends Transaction_Adam{

    @Override
    public boolean transfer(Account_Adam source, Account_Adam destination, BigDecimal nominal) {
        System.out.println("Memproses transaksi dari " + source.getNama() + " ke " + destination.getNama());

        boolean success = super.transfer(source, destination, nominal);

        if (success) {
            System.out.println("Notifikasi : Transfer berhasil");
        } else  {
            System.out.println("Notifikasi : Transfer gagal. Cek saldo/nominal transaksi");

        }

        return  success;
    }

}
