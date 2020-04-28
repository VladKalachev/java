package com.itvdn.javaStarter.methodsTwo;

public class C08_MethodsRecursion {
    // Нахождение наибольшего общего делителя (НОД) двух целых чисел

    // Первый вариант

    static int calculate(int a, int b) {
        if (a % b == 0)
            return b;
        else
            return calculate(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println("Нахождение наибольшего общего делителя двух целых чисел");

        int a = 676, b = 3676;

        System.out.println("a = " + a + ", b = " + b + ", НОД = " + calculate(a, b) + ";");
    }

    // Второй вариант решения

    static int calculate2(int a, int b) {
        while (b != 0)
            b = a % (a = b);
        return a;
    }
}
