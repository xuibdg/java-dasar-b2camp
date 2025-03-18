package rio.belajar_java_dasar;

public class KonversiTipeData_rio {
    public static void main(String[] args) {
        int angkaInt = 150;
        double angkaDouble = angkaInt;
        System.out.println("Konversi int ke double: " + angkaDouble);

        double angkaDouble2 = 88.88;
        int angkaInt2 = (int) angkaDouble2;
        System.out.println("Konversi double ke int: " + angkaInt2);
    }
}
