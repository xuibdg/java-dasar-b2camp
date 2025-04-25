package hirlan.solid.perbankan;

public class TransactionTransfer extends Transaction {
    private BankAccount fromAccount;
    private BankAccount toAccount;
    private double amount;

    public TransactionTransfer(BankAccount fromAccount, BankAccount toAccount, double amount) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
    }
    @Override
    public void execute(){
        fromAccount.tarikTunai(amount);
        toAccount.tarikTunai(amount);
        System.out.println("Transfer Sebesar "+amount+" Berhasil");
    }

}
