package hirlan.solid.perbankan;

import hirlan.solid.perbankan.infacerepo.Database;

public class Mains {
    public static void main(String[] args) {
        Database database = new PostgresqlDB();
        Application app = new Application(database);

        BankAccount bankAccount = new BankAccount();
        app.saveAccount(bankAccount);

        BankAccount account = new BankAccount( "7321447568", 800000);
        BankAccount account2 = new BankAccount( "4576889372", 300000);
        ReportGenerator reportGenerator = new ReportGenerator();

        //liskov
        SavingsAccount savingsAccount = new SavingsAccount(account, 2);
        SavingsAccount savingsAccount2 = new SavingsAccount(account2, 2);
        savingsAccount.applyInterest();
        savingsAccount2.applyInterest();
        reportGenerator.generateStatement(savingsAccount);
        reportGenerator.generateStatement(savingsAccount2);

        //
        DepositTransaction depositTransaction = new DepositTransaction(savingsAccount, 100000);
        CashWithDrawl cashWithDrawl = new CashWithDrawl(savingsAccount, 75000);
        depositTransaction.execute();
        reportGenerator.generateStatement(savingsAccount);
        cashWithDrawl.execute();
        reportGenerator.generateStatement(savingsAccount);

        TransactionTransfer transferBankAccount = new TransactionTransfer(savingsAccount, savingsAccount2, 20000);
        transferBankAccount.execute();
        reportGenerator.generateStatement(savingsAccount);
        reportGenerator.generateStatement(savingsAccount2);
    }
}
