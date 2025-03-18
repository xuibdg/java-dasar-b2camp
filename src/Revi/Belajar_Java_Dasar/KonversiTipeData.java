package Revi.Belajar_Java_Dasar;

public class KonversiTipeData {
    public static void main(String[] args) {
        int angkaInt = 50;
        double angkaDouble = angkaInt;

        double nilaiDouble = 50.75;
        int nilaiInt = (int) nilaiDouble;

        System.out.println("Konversi dari int ke double: " + angkaDouble);
        System.out.println("Konversi dari double ke int: " + nilaiInt);
    }}