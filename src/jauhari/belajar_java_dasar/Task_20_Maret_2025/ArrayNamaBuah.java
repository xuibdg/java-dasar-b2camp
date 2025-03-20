package jauhari.belajar_java_dasar.Task_20_Maret_2025;

import java.util.ArrayList;

public class ArrayNamaBuah {
    public static void main(String[] args) {
        System.out.println("Fruit List");

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Blueberry");
        fruits.add("Redberry");
        fruits.add("Cranberry");
        fruits.add("Strawberry");
        fruits.add("Moonberry");
        fruits.add("Blackberry");
        fruits.add("Raspberry");
        fruits.add("Gooseberry");
        fruits.add("Blueberry");
        fruits.add("Mulberry");
        System.out.println(fruits);
        fruits.remove("Cranberry");
        System.out.println("Fruits List after removing");
        System.out.println(fruits);
    }
}
