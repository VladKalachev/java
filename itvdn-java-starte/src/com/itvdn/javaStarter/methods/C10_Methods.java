package com.itvdn.javaStarter.methods;

import java.util.Scanner;

public class C10_Methods {
    // Параметр, передаваемый по значению, уничтожается при возврате значения методом
    // Чтобы получить изменённый результат используем ключевой слово return

    static int addTwo(int a) {
        a = a + 2;
        System.out.println("Значение int a = " + a);
        return a;
    }

    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner in = new Scanner(System.in);

        // Принимаем ввод от пользователя и преобразуем его в целочисленное значение

        String number = in.next();
        int result = Integer.parseInt(number);

        System.out.println("Значение result = " + result);

        // Присвоим переменной result значение, возвращённое методом addTwo()
        result = addTwo(result);
        System.out.println("Значение result = " + result);
    }
}
