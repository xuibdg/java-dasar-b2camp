package Valdi.Belajar_Java_Dasar;

public class Konversi {
    public static void main(String[] args) {

        int angkaInt = 2929;
        double angkaDouble = (double) angkaInt;

        double angkaDouble2 = 12.29;
        int angkaInt2 = (int) angkaDouble2;

        System.out.println("Konversi int ke double: " + angkaDouble);
        System.out.println("Konversi double ke int: " + angkaInt2);
    }
}
