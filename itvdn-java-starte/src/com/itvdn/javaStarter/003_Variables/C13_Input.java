package com.itvdn.javaStarter;

import java.util.Scanner;

public class C13_Input {
    // Объект класса Scanner позволяет обрабатывать ввод данных с консоли

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите целое число: ");
        int a = input.nextInt();       //считываем целое число

        System.out.println("Введите дробное число: ");
        float b = input.nextFloat();   //считываем дробное число


        System.out.println("Введите строку с пробелами: ");
        String c = input.next();       //считываем строку до первого пробела

        input = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String d = input.nextLine();   //считываем целую строку

        System.out.println(a + "\n" + b + "\n" + c + "\n" + d);
    }
}
