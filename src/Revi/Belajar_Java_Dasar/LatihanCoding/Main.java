package Revi.Belajar_Java_Dasar.LatihanCoding;

public class Main {
    public static void main(String[] args) {
        Mainan mainan1 = new Mainan(1, "Robot Gedeg", 25000);
        Mainan mainan2 = new Mainan(2, "Robocop", 30000);

        Bon bon = new Bon();
        bon.print(mainan1, mainan1.getPrice());
        System.out.println("\n");


        Discount discountMember = new DiscountMember();
        Kasir kasir = new Kasir(discountMember);
        kasir.prosesPembelian(mainan2);
    }
}