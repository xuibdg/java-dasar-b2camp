package Valdi.Belajar_Java_Dasar.Task_20_maret;

//Buatlah program yang menyimpan beberapa angka dalam LinkedList, lalu mencetak elemen pertama dan terakhir dari daftar tersebut.

import java.util.LinkedList;

public class Angka {
    public static void main(String[] args) {
        LinkedList<Integer> angkaList = new LinkedList<>();
        //linkedList untuk menyimpan angka

        angkaList.add(15);
        angkaList.add(16);
        angkaList.add(17);
        angkaList.add(18);
        angkaList.add(19);
        //add menambah nilai ke dalam angka list

        System.out.println("Elemen Pertama Adalah : " + angkaList.getFirst());//getFirst untuk menampilkan yang pertama
        System.out.println("Elemen Terakhir Adalah : " + angkaList.getLast());//getLast untuk menampilkan yang terakhir
    }
}
