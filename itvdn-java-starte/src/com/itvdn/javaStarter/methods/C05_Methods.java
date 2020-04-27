package com.itvdn.javaStarter.methods;

public class C05_Methods {
    // Сложение двух целых чисел.

    static int add(int summand1, int summand2) {
        return summand1 + summand2;
    }

    public static void main(String[] args) {
        int summand1 = 2, summand2 = 3;

        int sum = add(summand1, summand2);

        System.out.println(summand1 + " + " + summand2 + " = " + sum);
    }
}
