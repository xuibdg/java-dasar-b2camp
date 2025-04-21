package hirlan.streamlambda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class lamdaExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("aceng", "acang", "nggeng");

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
        map.put("nama", "entang");
        map.put("kota", "Bandung");
        map.put("pekerjaan", "SiPengembang");

        AtomicInteger a = new AtomicInteger();
        map.forEach((key, value) -> {
            System.out.println(key + " : " + value);
        });

    }
}
