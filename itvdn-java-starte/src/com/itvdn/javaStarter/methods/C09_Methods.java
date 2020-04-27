package com.itvdn.javaStarter.methods;

import java.util.Scanner;

public class C09_Methods {
    // Параметр, передаваемый по значению, уничтожается при возврате значения методом

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
        result = 10;
        // В качестве аргумента передается не сама переменная - result, а её копия.
        result = addTwo(result);
        System.out.println(addTwo(result));
        System.out.println(result);
    }
}
