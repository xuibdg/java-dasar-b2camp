package rafie.belajar_java_dasar.solid_learn;

public class ProductList {
    private int id;
    private String productName;
    private double price;
    private int qty;

    public ProductList(int id, String productName, double price, int qty) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.qty = qty;
    }

    public int getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }
}
