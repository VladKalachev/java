package ru.collections.java;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("First");
        c.add("Second");
        System.out.println(c.size());
        //c.remove("First");
        //System.out.println(c.size());
        Iterator<String> iterator = c.iterator();
//        while (iterator.hasNext()){
//           String next = iterator.next();
//           System.out.println(next);
//        }
//        for(String s : c) {
//            System.out.println(s);
//        }
        System.out.println(c.contains("First"));

        List<String> list = (List<String>) c;
        list.add(0, "Very first");

        print(list);

        System.out.println(list.indexOf("First"));

        Collection<String> c2 = Arrays.asList(new String[]{ "First", "Second" });
        c.removeAll(c2);
        print(c2);

        Iterator<String> iterator2 = c.iterator();

        while (iterator2.hasNext()) {
            String next = iterator2.next();
            if(next.equals("First")){
                iterator2.remove();
            }
        }
    }

    private static void print(Collection<?> list) {
        for(Object s : list) {
            System.out.println(s);
        }
        System.out.println();
        System.out.println();
    }
}
