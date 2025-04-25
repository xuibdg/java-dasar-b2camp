package Revi.Belajar_Java_Dasar.LatihanCoding;

public class DiscountMember implements Discount {
    @Override
    public double totalDiscount(double harga) {
        return harga - (harga * 20 / 100);
    }
}
