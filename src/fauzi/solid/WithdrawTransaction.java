package fauzi.solid;

public class WithdrawTransaction extends Transaction{

    private BankAccount account;
    private double amount;

    public WithdrawTransaction(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        account.withdraw(amount);
        System.out.println("transaction withdraw success Rp." + amount);
    }

}
