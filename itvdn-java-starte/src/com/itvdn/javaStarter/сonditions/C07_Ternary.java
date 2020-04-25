package com.itvdn.javaStarter;
import java.util.Scanner;

public class C07_Ternary {
    // Тернарная условная операция.

    public static void main(String[] args) {
        String string = "Hello ";

        System.out.println("Введите свой логин:");
        Scanner in = new Scanner(System.in);
        // На 14 строке создаем переменную с именем login типа String и принимаем в нее ввод от пользователя

        String login = in.next();

        // На 18 строке переменной string присваиваем возвращаемое значение тернарного оператора

        string += login.equals("Admin") ? "Administrator" : "User";
        System.out.println(string);
    }
}
