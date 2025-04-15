package Adam.Belajar_Java_dasar;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Belajarstream {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Uang Adam", 50);
        map.put("Uang Majid", 30);
        map.put("Uang Tama", 20);

        System.out.println(map);

        map.entrySet().stream()
                .forEach( (entry -> System.out.println(entry.getKey() + " = " + entry.getValue())));

        System.out.println("vvvvvvv Menjadi vvvvvvvv");

        Map<String, Integer> memperbaruiUang = map.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> entry.getValue() * 3
                ));
        System.out.println(memperbaruiUang);

    }
}
