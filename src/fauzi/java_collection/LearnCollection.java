package fauzi.java_collection;

import java.util.*;

public class LearnCollection {
    public static void main(String[] args) {


        System.out.println("_________________________________________Array");
        int[] i = {1,2,3,4,5};
        System.out.println(i[0]);

        System.out.println("_________________________________________ArrayList");
        List<String> list = new ArrayList<>();
        list.add("valdi");
        list.add("jumping");
        System.out.println(list);

        System.out.println("_________________________________________LinkedList");
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("buah");
        linkedList.add("mangga");
        linkedList.addFirst("anggur");
        System.out.println(linkedList);

        System.out.println("_________________________________________SET");
        Set<String> set = new HashSet<>();
        set.add("jambu");
        set.add("strawberry");
        set.add("alpukat");
        set.add("alpukat");
        set.add("alpukat");
        set.remove("jambu");
        System.out.println(set);



        System.out.println("_________________________________________MAP");
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "dnz");
        map.put(2, "adam");
        map.put(3, "rvld");
        map.put(4, "ikam");
        map.put(5, "ah");
        map.put(6, "rio");
        map.put(7, "fdl");
        map.put(8, "revi");
        map.put(9, "revi");
        map.remove(3);
        System.out.println(map.get(3));

        System.out.println("_________________________________________Queque");
        Queue<String> queue = new LinkedList<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.remove("A");
        System.out.println(queue.poll());


        System.out.println("_________________________________________Stack");
        Stack<String> stack = new Stack<>();
        stack.push("D");
        stack.push("B");
        stack.push("C");
        stack.push("A");
        System.out.println(stack.pop());


        System.out.println("_________________________________________TreeSet");
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(3);
        treeSet.add(2);
        treeSet.add(1);
        System.out.println(treeSet);


        System.out.println("_________________________________________TreeMap");
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(4, "bala bala");
        treeMap.put(2, "cimol bojot");
        treeMap.put(1, "gehu pedas");
        treeMap.put(3, "sop buah");
        System.out.println(treeMap);







    }
}
