package rio.OOP;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        account_rio accountRio = new account_rio("Rio", "22334455", 2000000);  // Account 1
        account_rio accountDesy = new account_rio("Desy", "98765434", 250000); // Account 2

        System.out.println("Saldo Awal");
        System.out.println(accountRio.getNama() + " = " + accountRio.getNorek() + ": " + accountRio.getSaldo());
        System.out.println(accountDesy.getNama() + " = " + accountDesy.getNorek() + ": " + accountDesy.getSaldo());

        InternalTransfer_rio transfer = new InternalTransfer_rio();
        double nominal = transfer.getTransferAmount();
        transfer.transaksi(accountRio, accountDesy, nominal);

        System.out.println("Saldo Akhir");
        System.out.println(accountRio.getNama() + " = " + accountRio.getNorek() + ": " + accountRio.getSaldo());
        System.out.println(accountDesy.getNama() + " = " + accountDesy.getNorek() + ": " + accountDesy.getSaldo());

        scanner.close();
    }
}
