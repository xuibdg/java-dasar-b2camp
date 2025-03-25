package Revi.Belajar_Java_Dasar;

public class InternalTransfer extends Transaction {

    @Override
    public void transaksi(Account sourceAccount, Account destinationAccount, double nominal) {
        if (nominal > 0 && nominal <= sourceAccount.getSaldo()) {
            sourceAccount.setSaldo(sourceAccount.getSaldo() - nominal);
            destinationAccount.setSaldo(destinationAccount.getSaldo() + nominal);
            System.out.println("Internal Transfer berhasil!");
        } else {
            System.out.println("Internal Transfer gagal!");
        }
    }
}



