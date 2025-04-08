package jauhari.belajar_java_dasar.Lamda;

// Alambda expression is a short block of code
// which takes in parameters and returns a value.
// Lambda expressions are similar to methods,
// but they do not need a name
//git and they can be implemented right in the body of a method.//
//

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class lamdaClass {
    public static void main(String[] args) {
        List<String> alatTuliss = Arrays.asList("pensil", "bolpen", "spidol");
        alatTuliss.forEach(alatTulis -> System.out.println(alatTulis));

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");

        List<Integer> nomorPunggungs = Arrays.asList(10, 11, 34, 8, 45);
        nomorPunggungs.forEach(nomorPunggung -> System.out.println(nomorPunggung));

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");

        Map<Integer, String> cars = new HashMap<>();
        cars.put(1, "rafie");
        cars.put(2, "adam");
        cars.put(3, "ikam");
        cars.put(4, "fadil");
        cars.put(5, "vadli");
//        absens.put(2, "razie");
//        absens.put(3, "ranie");
//        absens.put(4, "radie");
//        absens.put(5, "rawie");
        cars.forEach((key,value) -> System.out.println(key + " " + value ));
//        cars.forEach((key,value) -> System.out.println(cars));
          //cars.forEach((key,value) -> System.out.println());

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");

        LinkedList<String> pohons = new LinkedList<>(); //LinkedList adalah implementasi dari interface list yg memungkinkan penyisipan dan penghapusan elemen di tengah koleksi
        pohons.add("cemara");
        pohons.add("pinus");
        pohons.add("agatis");
        pohons.addFirst("keruing");
        pohons.add("meranti");
        AtomicInteger i = new AtomicInteger();
        pohons.forEach(pohon -> {
            System.out.println(pohon + " " + i.getAndIncrement());
        });
        //pohons.forEach(pohon -> System.out.println(pohon));

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");

        Set<String> books = new HashSet<>();  //set tidak menjaga urutan dan no duplikat
        books.add("novel");
        books.add("cerpen");
        books.add("majalah");
        books.add("tabloid");
        books.add("novel");
        books.forEach(book -> System.out.println(book));

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");

        Queue<String> antrians = new LinkedList<>(); //FIFO
        antrians.add("Pertama");
        antrians.add("Kedua");
        antrians.add("Ketiga");
        antrians.forEach(antrian -> System.out.println(antrian));

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");

        Stack<String> arsips = new Stack<>(); //LIFO
        arsips.add("2005");
        arsips.add("2006");
        arsips.add("2007");
        arsips.add("2008");
        arsips.forEach(arsip -> System.out.println(arsip));
    }


    //animals.forEach(animal -> System.out.println(animal));
}
