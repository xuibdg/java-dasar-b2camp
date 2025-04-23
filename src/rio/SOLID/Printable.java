package rio.SOLID;

//Interface Segregation Principle (ISP) - Interface kecil, sesuai kebutuhan

public interface Printable {
    void printReceipt();
}

class ReceiptPrinter implements Printable {
    public void printReceipt() {
        System.out.println("Printing Receipt...");
    }
}
