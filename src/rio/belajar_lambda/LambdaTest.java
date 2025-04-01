package rio.belajar_lambda;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class LambdaTest {
    public static void main(String[] args) {

        System.out.println("=====================");

        List<String> names = Arrays.asList("joni", "jeni", "ali", "budi");

        AtomicInteger i = new AtomicInteger();
        names.forEach( name -> {
            System.out.println(name + " " + i.getAndIncrement());
        });

        System.out.println("=====================");

        List<Integer> numbers = Arrays.asList(100, 200, 300, 400);

        AtomicInteger a = new AtomicInteger();
        numbers.forEach( number -> {
            System.out.println(number + " " + a.getAndIncrement());
        });

        System.out.println("=====================");

        Map<Integer, String> months = new HashMap<>();
        months.put(1, "maret");
        months.put(2, "april");
        months.put(3, "mei");
        months.put(4, "juni");

        AtomicInteger s = new AtomicInteger();
        System.out.println("key 1: " + months.get(1));
        System.out.println("key 4: " + months.get(4));

        months.forEach((key, value) -> {
            System.out.println();
    });

//        System.out.println("=====================");
//
//        LinkedList<String> linkedList = new LinkedList<>();
//        linkedList.add("apel");
//        linkedList.add("jeruk");
//        linkedList.add("semangka");
//
//        AtomicInteger r = new AtomicInteger();
//        linkedList.forEach(linkedList -> {
//            System.out.println();
//        });
    }
}


