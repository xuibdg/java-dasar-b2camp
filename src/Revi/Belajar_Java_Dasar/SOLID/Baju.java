package Revi.Belajar_Java_Dasar.SOLID;

public class Baju {
    private int id;
    private String Nama;
    private double Harga;

    public Baju(int id, String nama, double harga) {
        this.id = id;
        Nama = nama;
        Harga = harga;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return Nama;
    }

    public double getHarga() {
        return Harga;
    }
}