package rio.OOP;

// 3.buat class InternalTransfer (sub class transaction) implementasi ulang sesuai
//   internalTransfer , source di kurang, destination di tambah
//   —buat parameter nominal menggunakan scanner, dan gunakan prinsip OOP
import java.util.Scanner;

public class InternalTransfer_rio extends Transaction_rio {

    @Override
    public void transaksi(account_rio sourceAccount, account_rio destinationAccount, double nominal) {
        if (sourceAccount.getSaldo() >= nominal) {
            sourceAccount.setSaldo(sourceAccount.getSaldo() - nominal);
            destinationAccount.setSaldo(destinationAccount.getSaldo() + nominal);
            System.out.println("Transfer berhasil!");
        } else {
            System.out.println("Transfer Gagal! Saldo tidak cukup.");
        }
    }
    public double getTransferAmount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nominal Transfer: ");
        return scanner.nextDouble();
    }
}
