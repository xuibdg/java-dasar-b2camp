package Ichsan.belajar_java_Dasar;
//NO.4 Buatlah program yang menyimpan beberapa angka dalam LinkedList,dari daftar tersebut
//lalu mencetak elemen pertama dan terakhir
import java.util.LinkedList;

public class Angka_taks_4 {
    public static void main(String[] args) {
        LinkedList<Integer> Angka=new LinkedList<>();
        Angka.add(1);
        Angka.add(10);
        Angka.add(100);
        Angka.add(1000);
        Angka.add(10000);
        Angka.add(100000);
        Angka.add(1000000);
        System.out.println("Angka Pertama: " + Angka.getFirst());
        System.out.println("Angka Terakhir: " + Angka.getLast());
    }
}
