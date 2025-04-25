package hirlan.solid.perbankan;

//Open/Close Principle
public class DepositTransaction extends Transaction {

    private BankAccount bankAccount;
    private double amount;

    public DepositTransaction(BankAccount bankAccount, double amount) {
        this.bankAccount = bankAccount;
        this.amount = amount;
    }

    @Override
    public void execute(){
        bankAccount.deposit(amount);

    }
}
