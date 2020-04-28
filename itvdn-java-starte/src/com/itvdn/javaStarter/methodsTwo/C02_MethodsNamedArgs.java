package com.itvdn.javaStarter.methodsTwo;

public class C02_MethodsNamedArgs {
    // Именованные аргументы методов

    static int difference(int height, int width) {
        return height - width;
    }

    public static void main(String[] args) {
        // Можно вызвать метод так:
        int difference;
        difference = difference(6, 5);

        // difference = difference(5, 6);

        System.out.println("Разность равна: " + difference);
    }
}

