package Valdi.Belajar_Java_Dasar;

public class Konversi {
    public static void main(String[] args) {

        int AngkaInt = 2929;
        double AngkaDouble = (double) AngkaInt;
        //konversi dilakukan oleh "(double) angkaInt"


        double AngkaDouble2 = 12.29;
        int AngkaInt2 = (int) AngkaDouble2;
        //konversi dilakukan oleh "(int) angkaDouble2"

        System.out.println("Konversi int ke double: " + AngkaDouble);
        System.out.println("Konversi double ke int: " + AngkaInt2);
    }
}
