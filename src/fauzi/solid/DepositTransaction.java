package fauzi.solid;

import java.math.BigDecimal;

public class DepositTransaction extends Transaction{
    private BankAccount account;
    private double amount;

    public DepositTransaction(BankAccount bankAccount, double amount) {
        this.account = bankAccount;
        this.amount = amount;
    }

    @Override
    public void execute() {
        account.deposit(amount);
        System.out.println("transaction deposit success Rp." + amount);
    }
}
