package com.itvdn.javaStarter;

public class C12_TypesComparison {
    public static void main(String[] args) {
        boolean result1;
        boolean result2;
        boolean result3;

        int a = 1;
        float b = 2.0f;
        result1 = a == b;   // Сравнение значения типа int, со значением типа float - допустимо.

        String c = "Hello";
        String d = "Hello";
        // result = c < a; // Сравнение значения типа int, со значением типа String - не допустимо.
        result2 = c.equals(a);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(c == d);

        char u = 0x0001;
        result3 = a < u ;
        System.out.println(u);
        System.out.println(result3);
    }
}
