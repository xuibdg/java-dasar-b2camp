package fauzi.solid;

public class TransferBankAccount extends Transaction{
    private BankAccount fromAccount;
    private BankAccount toAccount;
    private double amount;


    public TransferBankAccount(BankAccount fromAccount, BankAccount toAccount, double amount) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
    }

    @Override
    public void execute() {
        fromAccount.withdraw(amount);
        toAccount.deposit(amount);
        System.out.println("Transfer sebesar :" + amount + " berhasil | dari :" + fromAccount.getAccountNumber() + " ke :" + toAccount.getAccountNumber());
    }



}
