package Revi.Belajar_Java_Dasar.SOLID;

public class Kasir implements PembayaranService {
    private Diskon diskon;

    public Kasir(Diskon diskon) {
        this.diskon = diskon;
    }

    @Override
    public double hitungTotalBayar(Baju baju) {
        // Menghitung harga setelah diskon menggunakan diskon yang disediakan
        double hargaSetelahDiskon = diskon.totalDiskon(baju.getHarga());
        return hargaSetelahDiskon;
    }
}