package Ichsan.belajar_java_Dasar.nama;

public class terbalik {
    public static void main(String[] args) {
     String nama ="Ichsan";
     String terbalik = new StringBuilder(nama).reverse().toString();
        System.out.println("nama: " + terbalik);
        //saya mengunakan  string builder seperti diatas
        //karna saya ingin membalikan nama ichsan dengan  metode reverse to string
    }
}
