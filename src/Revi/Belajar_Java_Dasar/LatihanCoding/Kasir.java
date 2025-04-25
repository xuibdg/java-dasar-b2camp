package Revi.Belajar_Java_Dasar.LatihanCoding;

public class Kasir {
    private Discount discount ;

    public Kasir(Discount discount) {
        this.discount = discount;
    }

    public void prosesPembelian(Mainan mainan) {
        double harga = mainan.getPrice();
        double hargaSetelahDiskon = discount.totalDiscount(harga);

        Bon bon = new Bon();
        bon.print(mainan, hargaSetelahDiskon);
    }
}
