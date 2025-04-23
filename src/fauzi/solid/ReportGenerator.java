package fauzi.solid;

public class ReportGenerator {

    public void generateStatement(BankAccount bankAccount){
        System.out.println("accountNumber :"+ bankAccount.getAccountNumber() + " balance account RP." + bankAccount.getBalance());
        System.out.println("------------------------------------------------");
    }

    public void generateStatement(SavingsAccount savingsAccount){
        System.out.println("accountNumber :"+ savingsAccount.getAccountNumber() + " balance account Rp." + savingsAccount.getBalance());
        System.out.println("------------------------------------------------");
    }
}
