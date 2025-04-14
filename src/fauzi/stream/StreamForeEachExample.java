package fauzi.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class StreamForeEachExample {

    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
//        numbers.stream().forEach(number -> System.out.println(number));

        String kalimat = " fauzi Indrawan  ";

        String vokal = "aiueo";

        String[] s = kalimat.toLowerCase().split(" ");

        System.out.println(kalimat.trim());
        System.out.println(kalimat.replace(" ", ""));

        //"fauzi" jadi stream [102, 97, 117, 122, 105]
        long count = kalimat.toLowerCase().chars().filter(node -> vokal.indexOf(node) >= 0).count();

        long countA = kalimat.toLowerCase().chars().filter(node -> vokal.indexOf(node) >= 0).count();
        System.out.println(count);



    }
}
