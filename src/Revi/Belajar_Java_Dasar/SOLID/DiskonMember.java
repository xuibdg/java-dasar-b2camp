package Revi.Belajar_Java_Dasar.SOLID;

public class DiskonMember implements Diskon{
    @Override
    public double totalDiskon(double harga){
        return harga - (harga * 10 / 100);
    }
}
class DiskonLebaran implements Diskon {
    @Override
    public double totalDiskon(double harga) {
        return harga - (harga * 20 / 100);
    }
}
