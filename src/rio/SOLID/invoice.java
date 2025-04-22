package rio.SOLID;

// Single Responsibility Principle (SRP)
public class invoice {
    private OrderRio order;
    private double pricePerItem;

    public invoice(OrderRio order, double pricePerItem) {
        this.order = order;
        this.pricePerItem = pricePerItem;
    }
    public double calculatorTotal() {
        return order.getQuantity() * pricePerItem;
    }
}
