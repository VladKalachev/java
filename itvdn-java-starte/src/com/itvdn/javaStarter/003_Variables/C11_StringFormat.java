package com.itvdn.javaStarter;

public class C11_StringFormat {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;

        // Конкатенация строк
        System.out.println("Это число " + a);

        // Форматирование строк с помощью метода format класса String
        System.out.println(String.format("Это число %1$s", a));

        // Метод printf() принадлежит классу PrintStream, который отвечает за вывод информации
        // и возвращает строку, отформатированую по заданным условиям
        System.out.printf("Это число %1$s \n", a);
        System.out.printf("Это числа %1$s и %2$s \n", b, c);
        System.out.printf("Это числа наоборот %2$s и %1$s", b, c);
        // Форматирование вывода числа Пи
        System.out.printf("\n%1$+022.10f", Math.PI);
    }
}
