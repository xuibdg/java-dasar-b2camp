package fauzi.solid;

public class MainSolid {
    public static void main(String[] args) {

        BankAccount account = new BankAccount( "44332277", 500000);
        BankAccount account2 = new BankAccount( "34554355", 500000);
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
        WithdrawTransaction withdrawTransaction = new WithdrawTransaction(savingsAccount, 75000);
        depositTransaction.execute();
        reportGenerator.generateStatement(savingsAccount);
        withdrawTransaction.execute();
        reportGenerator.generateStatement(savingsAccount);

        TransferBankAccount transferBankAccount = new TransferBankAccount(savingsAccount, savingsAccount2, 20000);
        transferBankAccount.execute();
        reportGenerator.generateStatement(savingsAccount);
        reportGenerator.generateStatement(savingsAccount2);

    }
}
