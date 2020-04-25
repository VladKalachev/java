package com.itvdn.javaStarter;
import java.util.Scanner;

public class C12_Switch {
    public static void main(String[] args) {
        int myDay;
        System.out.println("Введите номер дня недели: 1-2-3-4-5-6-7: ");
        Scanner in = new Scanner(System.in);
        myDay = in.nextInt();

        // Конвертируем значение строковой переменной myDay в целочисленное значение
        // и записываем его в переменную с именем myDay типа int

        switch (myDay) {
            case 1:
                System.out.println("Понедельник.");
                break;
            case 2:
                System.out.println("Вторник.");
                break;
            case 3:
                System.out.println("Среда.");
                break;
            case 4:
                System.out.println("Четверг.");
                break;
            case 5:
                System.out.println("Пятница.");
                break;
            case 6:
                System.out.println("Суббота.");
                break;
            case 7:
                System.out.println("Воскресенье.");
                break;
            default:
                System.out.println("Вы ввели несуществующий день недели.");
                break;
        }
    }
}
