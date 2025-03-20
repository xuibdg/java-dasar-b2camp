package Ichsan.belajar_java_Dasar;

public class Angka_taks_4 {
    public static void main(String[] args) {
        java.util.LinkedList<Integer> Angka=new java.util.LinkedList<>();
        Angka.add(1);
        Angka.add(10);
        Angka.add(100);
        Angka.add(1000);
        Angka.add(10000);
        Angka.add(100000);
        Angka.add(1000000);
        System.out.println("Angka Terakhir: " + Angka.getLast());
        System.out.println("Angka Pertama: " + Angka.getFirst());
    }
}
