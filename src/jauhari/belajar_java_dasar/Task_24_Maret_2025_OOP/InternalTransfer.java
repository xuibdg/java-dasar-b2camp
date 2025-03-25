package jauhari.belajar_java_dasar.Task_24_Maret_2025_OOP;

public class InternalTransfer extends Transaction{
    @Override
    public void transfer(Account accountAsal, Account accountTujuan, double jumlah) {
        if (jumlah <= accountAsal.getSaldo()) {
            accountAsal.setSaldo (accountAsal.getSaldo() - jumlah);
            accountTujuan.setSaldo (accountTujuan.getSaldo () + jumlah);
            System.out.println("Transfer Rp " + jumlah +  " Berhasil");
        }else {
            System.out.println("Transfer Gagal X");
        }

        System.out.println("Transfer selesai");
    }
}
