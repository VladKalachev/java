package com.itvdn.javaStarter;

import java.util.Scanner;

public class C13_Switch {
    // Оператор многозначного выбора - switch-case (переключатель). Проваливание.

    public static void main(String[] args) {
        System.out.println("Введите номер дня недели: 1-2-3-4-5-6-7: ");
        Scanner in = new Scanner(System.in);
        String day = in.next();

        switch (day) {
            // Для пустых операторов case разрешено "проваливание" от одного оператора к другому.
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
                System.out.println("Этот день недели - Рабочий.");
                break;
            case "6":
            case "7":
                System.out.println("Этот день недели - Выходной.");
                break;

            default:
                System.out.println("Вы ввели несуществующий день недели.");
                break;
        }
    }
}
