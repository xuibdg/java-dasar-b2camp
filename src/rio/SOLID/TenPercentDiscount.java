package rio.SOLID;

// Open/Closed Principle (OCP)
public class TenPercentDiscount implements Discount {
    @Override
    public double apply(double total) {
        return total * 0.9;
    }
}
