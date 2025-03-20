package Ichsan.belajar_java_Dasar;

public class ArrayBuah_task_2dan3 {
    public static void main(String[] args) {
        java.util.ArrayList<String> Buah_Buahan=new java.util.ArrayList<>();
        Buah_Buahan.add("Anggur");
        Buah_Buahan.add("Jeruk");
        Buah_Buahan.add("Semangka");
        Buah_Buahan.add("Melon");
        Buah_Buahan.add("Apel");
        Buah_Buahan.remove("Melon");
        System.out.println(Buah_Buahan);
    }
}