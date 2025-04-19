package rafie.belajar_java_dasar.Task_25_March_2025;

// Coba-coba lambda. Perbedaan yang anonim dengan lambda. apakah selain list bisa pake lambda?

// Bentuk umum Lambda: (parameter) -> { body }
// -> : operator/ekspresi Lambda.


import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class MencobaLambda {
    public static void main(String[] args) {

        List<String> namaNamaOrang = Arrays.asList("Adam", "Jauhari", "Fadhil", "Miko", "Kodir", "Michael");

        Map<Integer, String> dataAbsen = new HashMap<>();
        dataAbsen.put(1, "Ahmad");
        dataAbsen.put(2, "Budi");
        dataAbsen.put(3, "Taufiq");

        LinkedList<String> namaBuah = new LinkedList<>();
        namaBuah.add("Jeruk");
        namaBuah.add("Apel");
        namaBuah.add("Durian");
        namaBuah.add("Anggur");

        ArrayList<Integer> hargaBarang = new ArrayList<>();
        hargaBarang.add(10000);
        hargaBarang.add(12000);
        hargaBarang.add(13000);
        hargaBarang.add(14000);
        hargaBarang.add(15000);

        AtomicInteger i = new AtomicInteger();

        System.out.println(" ");
        System.out.println("Dibawah ini adalah List");
        namaNamaOrang.forEach(name -> {
            System.out.println(name + " " + i.getAndIncrement());
        });

        System.out.println(" ");
        System.out.println("Dibawah ini adalah Map");

        dataAbsen.forEach((key, value) -> {
            System.out.println("Nomor absen ke- " + key + " atas nama: " + value);
        });

        System.out.println(" ");
        System.out.println("Dibawah ini adalah LinkedList");

        namaBuah.forEach(namaBuahBaru -> {
            System.out.println("Saya suka buah " + namaBuahBaru);
        });

        System.out.println(" ");
        System.out.println("Dibawah ini adalah ArrayList");
        hargaBarang.forEach(hargaBarangBaru -> {
            System.out.println("Salah satu harga barang, yaitu: " + "Rp " + hargaBarangBaru);
        });
    }
}
