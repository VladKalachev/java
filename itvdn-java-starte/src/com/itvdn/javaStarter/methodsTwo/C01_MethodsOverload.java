package com.itvdn.javaStarter.methodsTwo;

public class C01_MethodsOverload {
    // Перегруженные методы могут отличаться типом и количеством аргументов.

    static void function() {                 // 1-я перегрузка.
        System.out.println("Hello!");
    }

    static void function(String s) {        // 2-я перегрузка.
        System.out.println(s);
    }

    static void function(int i) {           // 3-я перегрузка.
        System.out.println(i);
    }

    static void function(double d) {        // 4-я перегрузка.
        System.out.println(d);
    }

    static void function(String s, int i) { // 5-я перегрузка.
        System.out.println(s + i);
    }

    static void function(int i, String s) { // 6-я перегрузка.
        System.out.println(i + s);
    }

//    Перегруженные методы не могут отличаться возвращаемыми значениями!
//    static String function(String s) {   // 7-я перегрузка.
//
//        return s;
//    }

    public static void main(String[] args) {
        function();                  // 1-я перегрузка.
        function("A");               // 2-я перегрузка.
        function(1);                 // 3-я перегрузка.
        function(3.14);              // 4-я перегрузка.
        function("B ", 2);           // 5-я перегрузка.
        function(3, " C");           // 6-я перегрузка.
    }
}
