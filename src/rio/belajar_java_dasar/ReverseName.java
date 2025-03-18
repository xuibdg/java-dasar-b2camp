package rio.belajar_java_dasar;

public class ReverseName {
    public static void main(String[] args) {
        String name = "RIO RIKANA";
        String reversedName = new StringBuilder(name).reverse().toString();

        System.out.println("name: " + name);
        System.out.println("ReversedName: " + reversedName);
    }
}
