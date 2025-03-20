package Revi.Belajar_Java_Dasar;

import java.util.LinkedList;

public class Task_20_Maret_No4 {
    public static void main(String[] args) {

        LinkedList<Integer> angkaList = new LinkedList<>();

        angkaList.add(20);
        angkaList.add(40);
        angkaList.add(60);
        angkaList.add(80);
        angkaList.add(100);
        angkaList.add(120);

        // Mencetak elemen pertama dan terakhir
        System.out.println("Elemen pertama: " + angkaList.getFirst());
        System.out.println("Elemen terakhir: " + angkaList.getLast());
    }
}
