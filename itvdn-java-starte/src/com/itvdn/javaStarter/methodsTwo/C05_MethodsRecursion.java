package com.itvdn.javaStarter.methodsTwo;

public class C05_MethodsRecursion {
    // Рекурсия (простая рекурсия).

    // В теле метода recursion на 15-й строке рекурсивно вызывается метод recursion.
    // Простая рекурсия - вызов методом самого себя (самовызов). При каждом вызове строится новая копия метода.

    static void recursion(int counter) {
        counter--;

        System.out.println("Первая половина метода: " + counter);

        if (counter != 0)
            recursion(counter);

        System.out.println("Вторая половина метода: " + counter);
    }

    public static void main(String[] args) {
        recursion(3);
    }
}
