package fauzi.solid;

public class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(BankAccount bankAccount, double interestRate) {
        super(bankAccount.getAccountNumber(), bankAccount.getBalance());
        this.interestRate = interestRate;
    }

    public void applyInterest(){
        setBalance(getBalance() - (getBalance() * (interestRate / 100)));
    }



}
