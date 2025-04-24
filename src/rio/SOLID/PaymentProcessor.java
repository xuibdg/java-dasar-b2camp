package rio.SOLID;

// Dependency Inversion Principle (DIP) - Tergantung pada interface, bukan class langsung

public interface PaymentProcessor {
    void processPayment(double amount);
}

class CashProcessor implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("\nCash Payment: Rp." + amount);
    }
}

class Checkout {
    private PaymentProcessor processor;

    public Checkout(PaymentProcessor processor) {
        this.processor = processor;
    }

    public void completeCheckout(double amount) {
        processor.processPayment(amount);
    }
}
