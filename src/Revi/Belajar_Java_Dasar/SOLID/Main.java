package Revi.Belajar_Java_Dasar.SOLID;

public class Main {
    public static void main(String[] args) {
        Baju baju1 = new Baju(1, "DORA", 75000);
        Baju baju2 = new Baju(2, "ILOVEPAPAH", 80000);
        Baju baju3 = new BajuAlwaysDiskon(3, "PINKPANTHER", 72000, 0.25);

        StrukPembelian strukPembelian = new StrukPembelian();
        strukPembelian.print(baju1, baju1.getHarga());
        System.out.println("-----------------------------------");

        Diskon diskonLebaran = new DiskonLebaran();
        PembayaranService pembayaranService = new Kasir(diskonLebaran);
        double totalBayarBaju2 = pembayaranService.hitungTotalBayar(baju2);
        strukPembelian.print(baju2, totalBayarBaju2);
        System.out.println("----------------------------------");


        double totalBayarBaju3 = pembayaranService.hitungTotalBayar(baju3);
        strukPembelian.print(baju3, totalBayarBaju3);
    }
}