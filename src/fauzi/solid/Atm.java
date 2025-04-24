package fauzi.solid;

public class Atm implements AtmOperation {
    @Override
    public void displayBalance() {
        System.out.println("menampilkan saldo");
    }

    @Override
    public void printReceipt() {
        System.out.println("mencetak struk");
    }
}
