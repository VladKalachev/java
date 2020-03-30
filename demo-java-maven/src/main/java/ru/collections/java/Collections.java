package ru.collections.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class Collections {
    public static void main(String[] args) {
        Collection<String> c = new TreeSet<>();
        c.add("First");
        c.add("Second");
        System.out.println(c.size());
        //c.remove("First");
        //System.out.println(c.size());
        Iterator<String> iterator = c.iterator();
        while (iterator.hasNext()){
           String next = iterator.next();
           System.out.println(next);
        }
        for(String s : c) {
            System.out.println(s);
        }
        System.out.println(c.contains("First"));
    }
}
