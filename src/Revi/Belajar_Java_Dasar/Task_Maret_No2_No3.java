package Revi.Belajar_Java_Dasar;

import java.util.ArrayList;

public class Task_Maret_No2_No3 {
    public static void main(String[] args) {

        ArrayList<String> FruitList = new ArrayList<>();

        // Menambahkan nama-nama buah ke dalam ArrayList
        FruitList.add("Dragonfruit");
        FruitList.add("Mango");
        FruitList.add("Pineapple");
        FruitList.add("Starfruit");
        FruitList.add("Kiwi");
        FruitList.add("Khuldi");
        FruitList.remove("Khuldi");
        FruitList.remove(4);

        for (String Fruit : FruitList) {
            System.out.println(Fruit);
        }
    }
}
