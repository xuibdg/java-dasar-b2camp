package Adam.Belajar_Java_dasar;

import java.util.ArrayList;
import java.util.List;

public class NamaBuah {
    public static void main(String[] args) {
        System.out.println("NAMA-NAMA BUAH YANG ENAK DIJADIKAN BUKA PUASA");
        List<String> list = new ArrayList<>();
        list.add("KURMA");
        list.add("SEMANGKA");
        list.add("APEL");
        list.add("MANGGA");
        list.add("ANGGUR");
        list.add("MELON");
        list.add("NAGA");
        list.add("PIR");
        list.remove("MANGGA");
        System.out.println(list);
    }
}
