package Ichsan.belajar_java_Dasar.lambda;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class learnLambda {
    public static void main(String[] args) {
        System.out.println("-==LIST STRING==-");
        List<String> names = Arrays.asList("Abay", "Sugeng", "Patrick");
        AtomicInteger a =new AtomicInteger();
    names.forEach(name -> {
        System.out.println(name + " " + a.getAndIncrement() );
    });
        System.out.println("-==LINGKEDLIST==-");
        LinkedList<Integer> Numbers =new LinkedList<>();
        AtomicInteger n = new AtomicInteger();
        Numbers.add(1);
        Numbers.add(2);
        Numbers.add(3);
        Numbers.add(4);
        Numbers.forEach(Number -> {
            System.out.println("Nomor: " + Number);
        });
        System.out.println("-==MAP==-");
        Map<Integer,String> SuperHeroes = new HashMap<>();
        SuperHeroes.put(1,"Batman");
        SuperHeroes.put(2,"GatotKoco");
        SuperHeroes.put(3,"Bledex");
        SuperHeroes.put(4,"Aldous");
        SuperHeroes.forEach( (key , value ) -> {
            System.out.println("\nSuper Heroes No : " + key + " " + "\nSuper Heroes Name: " + value);
        });
        System.out.println("-==SET==-");
        Set<String> set =new HashSet<>();
        set.add("Bolu");
        set.add("Kopi");
        set.add("Rokok");
        set.add("Gorengan");
        set.forEach(s->{
            System.out.println("Menu: " + s );

        });

    }

}
