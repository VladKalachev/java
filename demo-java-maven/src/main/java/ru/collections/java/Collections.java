package ru.collections.java;

import java.util.*;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

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

        // HashSet
        Set<Person> set = new HashSet<>();
        set.add(new Person("First", 25));
        set.add(new Person("Seconsd", 20));
        set.add(new Person("Third", 30));
        set.add(new Person("Forth", 35));
        print(set);
        System.out.println(set.contains(new Person("First", 25)));

        // Map
        Map<String, String> map = new HashMap<>();
        map.put("Ivanov", "12123");
        map.put("Sidorov", "23-345");
        map.put("Petrov", "345-5");
        System.out.println(map.get("Ivanov"));
        for(String key: map.keySet()) {
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }
        System.out.println(map.containsKey("Petrov"));


    }

    private static void print(Collection<?> list) {
        for(Object s : list) {
            System.out.println(s);
        }
        System.out.println();
        System.out.println();
    }
}
