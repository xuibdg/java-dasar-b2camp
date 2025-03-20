package Valdi.Belajar_Java_Dasar;

public class Looping {
    public static void main(String[] args) {

        System.out.println("for ==========");

        for (int i = 0; i < 5; i++){
            System.out.println("Pengulangan ke : " + i);
        }

        System.out.println(" ");
        System.out.println("while==========");

        int a = 0;
        while (a < 5){
        System.out.println("Pengulangan ke : " + a);
        a++; }

        System.out.println(" ");
        System.out.println("do-while==========");

        int b = 0;
        do {
            System.out.println("Pengulangan ke : " + b);
            b++;
        }while (b < 5);
    }
}
