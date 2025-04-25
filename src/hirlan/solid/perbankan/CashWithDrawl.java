package hirlan.solid.perbankan;

public class CashWithDrawl extends Transaction{

    private BankAccount bankAccounts;
    private double amount;

    public CashWithDrawl(BankAccount bankAccounts, double amount) {
        this.bankAccounts = bankAccounts;
        this.amount = amount;
    }

    @Override
    public void execute(){
        bankAccounts.tarikTunai(amount);
    }
}
