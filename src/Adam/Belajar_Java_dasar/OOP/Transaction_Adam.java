package Adam.Belajar_Java_dasar;

import java.math.BigDecimal;
import java.util.Scanner;

public class Transaction_Adam {

    public void display(Account_Adam account) {
        System.out.println("Informasi Rekening : " + account.getNama() + " - " + account.getNoRekening() + " | Saldo : Rp." + account.getSaldo());
    }
    public boolean transfer(Account_Adam source, Account_Adam destination, BigDecimal nominal) {
        if (nominal.compareTo(BigDecimal.ZERO) > 0 && nominal.compareTo(source.getSaldo()) <= 0) {
            source.setSaldo(source.getSaldo().subtract(nominal));
            destination.setSaldo(destination.getSaldo().add(nominal));
            System.out.println("Transfer Sukses : " + source.getNama() + " mengirim " + nominal + " kepada " + destination.getNama());
            return true;
        } else {
            System.out.println("Transfer Gagal : nominal saldo tidak cukup");
            return false;
        }

    }
    public void informasi(Account_Adam account) {
        System.out.println("Informasi Saldo :" + account.getNoRekening() + "Nominal Saldo : " + account.getSaldo());
    }

}
