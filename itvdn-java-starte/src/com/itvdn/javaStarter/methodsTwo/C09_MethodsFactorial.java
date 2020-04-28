package com.itvdn.javaStarter.methodsTwo;

public class C09_MethodsFactorial {
    // Нахождение факториала числа.

    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int factorial = factorial(5);

        System.out.println(factorial);
    }
}
