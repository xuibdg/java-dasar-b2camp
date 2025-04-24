package rafie.belajar_java_dasar.Task_17_April_2025;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<DataFood> foodMenu = new ArrayList<>();

        foodMenu.add(new DataFood(1, "Salad", 200, true));
        foodMenu.add(new DataFood(2, "Tahu Goreng", 350, true));
        foodMenu.add(new DataFood(3, "Nasi Padang", 800, false));
        foodMenu.add(new DataFood(4, "Burger", 700, false));

        for (DataFood dfs : foodMenu) {
            if (dfs.isVegetarian() && dfs.getCalories() < 500) {
                System.out.println("Makanan vegetarian dibawah 500 kalori: " + dfs.getName() + " - " + dfs.getCalories() + " kalori");
            }
        }

        System.out.println("\n");
        DataFood highestCalories = foodMenu.get(0);
        for (DataFood dfs : foodMenu) {
            if (dfs.getCalories() > highestCalories.getCalories()) {
                highestCalories = dfs;
            }
        }
        System.out.println("Makanan dengan kalori tertinggi, yaitu " + highestCalories.getName() + " dengan kalori " + highestCalories.getCalories());

        foodMenu.sort(Comparator.comparingInt(DataFood::getCalories).reversed());
        System.out.println("\n");
        System.out.println("Urutan makanan berdasarkan kalori: ");
        for (DataFood df : foodMenu) {
            System.out.println("- " + df.getName() + " - " + df.getCalories() + " kalori");
        }

    }
}
