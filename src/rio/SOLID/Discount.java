package rio.SOLID;

// Open/Closed Principle (OCP) - open utk extension tetapi closed utk modification

public interface Discount {
    double apply(double total);
}

class TenPercentDiscount implements Discount {
    public double apply(double total) {
        return total * 0.9;
    }
}
