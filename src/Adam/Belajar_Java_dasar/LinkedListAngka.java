package Adam.Belajar_Java_dasar;

import java.util.LinkedList;

public class LinkedListAngka {
    public static void main(String[] args) {
        System.out.println("DAFTAR ANGKA");
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(11);
        linkedList.add(12);
        linkedList.add(13);
        linkedList.add(14);
        linkedList.add(15);
        linkedList.add(16);
        linkedList.add(17);
        System.out.println(linkedList);
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
    }
}
