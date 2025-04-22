package rio.SOLID;

public class main {
    public static void main(String[] args) {
        OrderRio orderRio = new OrderRio("Nasi Padang", 5);
        invoice invoice = new invoice(orderRio, 25000);

        double total = invoice.calculatorTotal();
    }
}
