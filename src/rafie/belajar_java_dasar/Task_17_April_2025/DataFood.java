package rafie.belajar_java_dasar.Task_17_April_2025;

//Buat class FoodItem dengan atribut: id, name, calories, dan isVegetarian (boolean).
//
//Simpan data makanan dalam list.
//Tampilkan makanan vegetarian dengan kalori di bawah 500.
//Cari makanan dengan kalori tertinggi.
//Urutkan makanan berdasarkan kalori dari tertinggi ke terendah.
//
//
//Makanan vegetarian di bawah 500 kalori:
//- Salad - 200 kalori
//- Tahu Goreng - 350 kalori
//
//Makanan dengan kalori tertinggi:
// - Nasi Padang - 800 kalori
//
//Urutan makanan berdasarkan kalori:
//- Nasi Padang - 800 kalori
//- Burger - 700 kalori
//- Tahu Goreng - 350 kalori
//- Salad - 200 kalori

public class DataFood {
    private int id;
    private String name;
    private int calories;
    private boolean isVegetarian;

    public DataFood(int id, String name, int calories, boolean isVegetarian) {
        this.id = id;
        this.name = name;
        this.calories = calories;
        this.isVegetarian = isVegetarian;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }
}
