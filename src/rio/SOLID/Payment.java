package rio.SOLID;

//Liskov Substitution Principle (LSP) - Subclass bisa menggantikan parent

abstract class Payment {
    abstract void pay(double amount);
}

class CashPayment extends Payment {
    public void pay(double amount){
        System.out.println();
    }
}

