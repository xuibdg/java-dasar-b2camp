package fauzi.oop;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        Anjing anjing = new Anjing();
        Kucing kucing = new Kucing("moli");
        anjing.nama = "jony";
        anjing.suara();
        kucing.suara();

        // @Override adalah ciri dia nge implementasi metode abstract
        // @Overloading

    }
}
