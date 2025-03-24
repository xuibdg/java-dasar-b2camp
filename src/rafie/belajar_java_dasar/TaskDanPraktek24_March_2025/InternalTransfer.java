package rafie.belajar_java_dasar.TaskDanPraktek24_March_2025;

public class InternalTransfer extends Transaction{

    @Override
    public void transaksi(Account sourceAccount, Account destinationAccount, int nominal) {

        if (sourceAccount.getSaldo() >= nominal) {
            sourceAccount.setSaldo(sourceAccount.getSaldo() - nominal);
            destinationAccount.setSaldo(destinationAccount.getSaldo() + nominal);
        } else {
            System.out.println("Saldo Anda tidak cukup untuk melakukan transfer uang.");
        }
    }
}
