package ru.build.java;

// import com.google.common.collection.Lists;

import java.util.ArrayList;
import java.util.List;

public class MyClass {
    public static void main(String[] args) {
//         test(Lists.asList("Sully", args).toString());
        List<String> list = new ArrayList();
        System.out.println("Main!");
    }

    private static void test() {
        System.out.println("Hello!");
    }
}
