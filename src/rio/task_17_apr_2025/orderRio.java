package rio.task_17_apr_2025;

//6. Buat class Order dengan atribut: orderId, productName, quantity, dan pricePerItem.

import java.text.NumberFormat;
import java.util.Locale;

class orderRio {
    String orderId;
    String productName;
    int quantity;
    double pricePerItem;

    public orderRio(String orderId, String productName, int quantity, double pricePerItem) {
        this.orderId = orderId;
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }
    public double getTotalPrice(){
        return quantity * pricePerItem;
    }
    public String formatCurrency(double value){
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("in", "ID"));
        return nf.format(value);
    }
    public void printDetail() {
        System.out.println("Order ID : " + orderId);
        System.out.println("Product Name : " + productName);
        System.out.println("Quantity : " + quantity);
        System.out.println("Price/Item : " + formatCurrency(pricePerItem));
        System.out.println("Total : " + formatCurrency(getTotalPrice()));
        System.out.println("---------------------------");

    }
}
