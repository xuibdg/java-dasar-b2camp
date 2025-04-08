package Valdi.Belajar_Java_Dasar.Lamda;

//        coba"
//        perbedaan anonim
//        selain list apa yang bisa dijadikan lamda

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class LearnLamda {
    public static void main(String[] args) {



        System.out.println("====================list string");

        List<String> names = Arrays.asList("valdi", "Ikam", "Rio");
        AtomicInteger i = new AtomicInteger();

        names.forEach(name -> {
            System.out.println(name + " - " + i.getAndIncrement());
        });



        System.out.println("====================list integer");

        List<Integer> numbers = Arrays.asList(1, 2, 3);
        AtomicInteger o = new AtomicInteger();

        numbers.forEach(number -> {
            System.out.println(number + " - " + o.getAndIncrement());
        });



        System.out.println("====================array list");

        ArrayList<String> cars = new ArrayList<>();
        cars.add("avanza");
        cars.add("agya");
        cars.add("jimny");
        cars.add("crv");
        cars.add("crown");

        cars.forEach( car -> {
            System.out.println("Jenis mobil : " + car);
        });



        System.out.println("====================linked list");

        LinkedList<Integer> prices = new LinkedList<>();
        prices.add(100000000);
        prices.add(250000000);
        prices.add(300000000);
        prices.add(150000000);
        prices.add(125000000);

        prices.forEach( price -> {
            System.out.println("Harga : " + price);
        });



        System.out.println("====================set");

        Set<String> dealers = new HashSet<>();
        dealers.add("Toyota");
        dealers.add("Subaru");
        dealers.add("Suzuki");
        dealers.add("Honda");
        dealers.add("Mazda");

        dealers.forEach( dealer -> System.out.println("Merek mobil tersebut adalah : " + dealer));



        System.out.println("====================map");

        Map<Integer, String> address = new HashMap<>();
        address.put(1, "jl.nagrog");
        address.put(2, "jl.paledang");
        address.put(3, "jl.sukamiskin");
        address.put(4, "jl.antapani");
        address.put(5, "jl.dago");

        address.forEach( (key, value) -> System.out.println("Alamat dealer : No " + key + " Alamat : " + value));



        System.out.println("====================Queue");

        Queue<Integer> platNo = new LinkedList<>();
        platNo.add(2435);
        platNo.add(8395);
        platNo.add(1493);
        platNo.add(2047);
        platNo.add(3758);

        platNo.forEach( platBaru -> System.out.println("Nomor plat tersebut adalah : " + platBaru));



        System.out.println("====================stack");

        Stack<String> colors = new Stack<>();
        colors.add("merah");
        colors.add("kuning");
        colors.add("hijau");
        colors.add("biru");
        colors.add("orange");

        colors.forEach( color -> System.out.println("Warna mobil tersebut adalah : " + color));



        System.out.println("====================treeset");

        TreeSet<Integer> harga = new TreeSet<>();
        harga.add(500000000);
        harga.add(175000000);
        harga.add(256000000);
        harga.add(550000000);
        harga.add(575000000);

        harga.forEach( hargaBaru -> System.out.println("Harga mobil saat baru : " + hargaBaru));



        System.out.println("====================treemap");

        TreeMap<Integer, String> transmisi = new TreeMap<>();
        transmisi.put(0, "Manual");
        transmisi.put(1, "Matic");
        transmisi.put(2, "Matic");
        transmisi.put(3, "Manual");
        transmisi.put(4, "Matic");

        transmisi.forEach( (key, valeu) -> System.out.println("Transmisi mobil no : " + key + " tersebut adalah : " + valeu) );
    }
}
