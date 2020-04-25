package com.itvdn.javaStarter;

import java.util.Scanner;

public class C14_CoffeeMachine {

    public static void main(String[] args) {
        // Предлагаем пользователю выбрать напиток.
        System.out.println("Размеры стаканчиков кофе: 1 = Маленький, 2 = Средний, 3 = Большой");
        System.out.print("Пожалуйста, сделайте свой выбор: ");

        // Принимаем ввод от пользователя.
        Scanner in = new Scanner(System.in);
        String coffeeSize = in.next();

        int cost = 0;

        switch (coffeeSize) {
            case "3":
                cost += 50;
            case "2":
                cost += 25;
            case "1":
                cost += 25;
                break;
            default:
                System.out.println("Неверный выбор. Пожалуста выберите 1, 2, или 3.");
                break;
        }

        if (cost != 0) {
            System.out.println("Внесите " + cost + " копеек.");
            System.out.println("Спасибо!");
        } else {
            System.out.print("Пожалуйста, повторите выбор.");
        }
    }
}
