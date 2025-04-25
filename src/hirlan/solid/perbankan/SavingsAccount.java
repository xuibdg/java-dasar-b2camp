package hirlan.solid.perbankan;

//contoh LSP atau Liskov misal kelas savingAccount
// menjadi turunan kelas yang memperluas dari kelas BankAccount dapat ditambahkan
// fitur baru mengenai bunga dengan tidak mengubah isi dari parent kelasnya
public class SavingsAccount extends BankAccount{

    private double interestRate;

    public SavingsAccount(BankAccount bankAccount, double interestRate) {
        super(bankAccount.getAccountNumber(), bankAccount.getBalance());
        this.interestRate = interestRate;
    }

    public void applyInterest(){
        setBalance(getBalance() -(getBalance() *(interestRate/100)));
    }
}
