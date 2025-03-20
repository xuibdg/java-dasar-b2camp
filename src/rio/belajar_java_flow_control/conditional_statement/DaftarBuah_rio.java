package rio.belajar_java_flow_control.conditional_statement;

import java.util.ArrayList;

public class DaftarBuah_rio {
    public static void main(String[] args) {
        ArrayList<String> buahList = new ArrayList<>();

        buahList.add("Anggur");
        buahList.add("Apel");
        buahList.add("Pisang");
        buahList.add("Semangka");
        buahList.add("Mangga");
        buahList.add("Jeruk");
        buahList.remove("Semangka");

        System.out.println("Daftar buah-buahan:");
        for (String buah : buahList) {
            System.out.println(buah);
        }
    }
}
