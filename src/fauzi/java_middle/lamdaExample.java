package fauzi.java_middle;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class lamdaExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("adam", "hari", "valdi");

        for (int i = 1; i <= names.size(); i++) {
            System.out.println(names.get(i));
        }

        AtomicInteger i = new AtomicInteger();
        names.forEach(name -> {
            System.out.println(name + " " + i.getAndIncrement());
        });

        names.forEach(name -> {
            System.out.println(name + " " + i.getAndIncrement());
        });


        Map<String, String> map = new HashMap<>();
        map.put("name", "elis");
        map.put("city", "bandung");
        map.put("job", "Developer");

        AtomicInteger a = new AtomicInteger();
        map.forEach((key, value) -> {
            System.out.println(key + " : " + value);
        });

    }
}
