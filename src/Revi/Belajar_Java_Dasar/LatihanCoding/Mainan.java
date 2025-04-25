package Revi.Belajar_Java_Dasar.LatihanCoding;

public class Mainan {
    private int id;
    private String name;
    private double Price;

    public Mainan(int id, String name, double price) {
        this.id = id;
        this.name = name;
        Price = price;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return Price;
    }
}
