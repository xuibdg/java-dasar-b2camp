package Revi.Belajar_Java_Dasar.SOLID;

public class Payment implements Pembayaran {
    private Diskon diskon;

    public Payment(Diskon diskon) {
        this.diskon = diskon;
    }

    @Override
    public double prosesBayar(Baju baju) {
        double hargaSetelahDiskon = diskon.totalDiskon(baju.getHarga());
        return hargaSetelahDiskon;
    }
}