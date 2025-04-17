package rafie.belajar_java_dasar.Task_24_March_2025;

// InternalTransfer.java adalah turunan dari Transaction.java

public class InternalTransfer extends Transaction{

    @Override
    public void transaksi(Account sourceAccount, Account destinationAccount, int nominal) {
//        super.transaksi(sourceAccount, destinationAccount, nominal);
        if (sourceAccount.getSaldo() >= nominal) {
            sourceAccount.setSaldo(sourceAccount.getSaldo() - nominal);
            destinationAccount.setSaldo(destinationAccount.getSaldo() + nominal);
        } else {
            System.out.println("Saldo Anda tidak cukup untuk melakukan transfer uang.");
        }
    }
}
