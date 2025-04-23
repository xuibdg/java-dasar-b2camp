package rio.SOLID;

public class main {
    public static void main(String[] args) {
        OrderRio orderRio = new OrderRio("Nasi Padang", 3);
        invoice invoice = new invoice(orderRio, 25000);

        double total = invoice.calculatorTotal();

       // OCP - Gunakan diskon tanpa ubah kode Invoice
        Discount discount = new TenPercentDiscount();
        double totalAfterDiscount = discount.apply(total);

        // LSP dan DIP - Bayar dengan cara apa saja
        PaymentProcessor payment = new CashProcessor();
        Checkout checkout = new Checkout(payment);
        checkout.completeCheckout(totalAfterDiscount);

        // ISP - Print struk
        Printable printer = new ReceiptPrinter();
        printer.printReceipt();
    }
}
