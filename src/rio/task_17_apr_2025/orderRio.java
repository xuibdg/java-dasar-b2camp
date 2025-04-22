package rio.task_17_apr_2025;

//6. Buat class Order dengan atribut: orderId, productName, quantity, dan pricePerItem.
//   -    Simpan beberapa data pesanan.
//   -    Tampilkan pesanan dengan total transaksi di atas 100.000.
//   -    Cari pesanan dengan total transaksi terbesar.
//   -    Urutkan pesanan berdasarkan total transaksi dari yang terbesar ke terkecil.
//
//        contoh output
//
//        Pesanan dengan total transaksi di atas Rp100.000:
//        - Order#1: Laptop - Total: Rp7.500.000
//        - Order#2: Mouse - Total: Rp150.000
//
//        Pesanan dengan total transaksi terbesar:
//        - Order#1: Laptop - Total: Rp7.500.000
//
//        Daftar pesanan berdasarkan total transaksi:
//        - Order#1: Laptop - Rp7.500.000
//        - Order#2: Mouse - Rp150.000
//        - Order#3: Kabel HDMI - Rp90.000

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
