package Revi.Belajar_Java_Dasar.SOLID;

public class BajuAlwaysDiskon extends Baju {
    private double diskon;

    public BajuAlwaysDiskon(int id, String nama, double harga, double diskon) {
        super(id, nama, harga);
        this.diskon = diskon;
    }


    @Override
    public double getHarga() {
        return super.getHarga() * (1 - diskon);
    }
}