package Adam.Belajar_Java_dasar.OOP;

import java.math.BigDecimal;
import java.util.Scanner;

public class MainTransfer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account_Adam sourceAccount = new Account_Adam("Adam", 87544390, BigDecimal.valueOf(1000000000));
        Account_Adam destinationAccount = new Account_Adam("Majid", 23968789, BigDecimal.valueOf(500000000));

        Transaction_Adam transactionFinish = new Transaction_Adam();

        System.out.println("Nominal Saldo Awal : ");
        transactionFinish.display(sourceAccount);
        transactionFinish.display(destinationAccount);

        System.out.print("Jumlah Transfer : ");
        BigDecimal nominalTransfer = scanner.nextBigDecimal();
        scanner.nextLine();

        transactionFinish.transfer(sourceAccount, destinationAccount, nominalTransfer);
        transactionFinish.display(sourceAccount);
        transactionFinish.display(destinationAccount);
        transactionFinish.informasi(sourceAccount);
        transactionFinish.informasi(destinationAccount);

        scanner.close();







    }
}
