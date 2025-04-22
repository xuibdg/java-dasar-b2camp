package rio.SOLID;

// Open/Closed Principle (OCP)
public class NoDiscount implements Discount {
    @Override
    public double apply(double total) {
        return total;
    }
}
