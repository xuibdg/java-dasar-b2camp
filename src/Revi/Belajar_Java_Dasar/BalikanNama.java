package Revi.Belajar_Java_Dasar;

public class BalikanNama {
    public static String reverseName(String name) {
        return new StringBuilder(name).reverse().toString();
    }

    public static void main(String[] args) {
        String name = "Revi Satria";
        String reversed = reverseName(name);
        System.out.println("Real name      : " + name);
        System.out.println("Reverse Name   : " + reversed);
    }
}