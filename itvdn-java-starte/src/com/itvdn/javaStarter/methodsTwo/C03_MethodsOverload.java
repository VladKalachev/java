package com.itvdn.javaStarter.methodsTwo;

public class C03_MethodsOverload {
    // Перегрузка методов.

    static void operation() {                                           // 1-я перегрузка.
        operation("val", 10, 12.2);
    }

    static void operation(String value1) {                              // 2-я перегрузка.
        operation(value1, 10, 12.2);
    }

    static void operation(String value1, int value2) {                  // 3-я перегрузка.
        operation(value1, value2, 12.2);
    }

    static void operation(String value1, int value2, double value3) {   // 4-я перегрузка.
        System.out.println(value1 + ", " + value2 + ", " + value3);
    }

    public static void main(String[] args) {
        operation();                  // 1-я перегрузка.
        operation("val");             // 2-я перегрузка.
        operation("val", 10);         // 3-я перегрузка.
        operation("val", 10, 12.2);   // 4-я перегрузка.
    }
}
