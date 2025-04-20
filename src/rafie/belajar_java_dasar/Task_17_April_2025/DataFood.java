package rafie.belajar_java_dasar.Task_17_April_2025;

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
