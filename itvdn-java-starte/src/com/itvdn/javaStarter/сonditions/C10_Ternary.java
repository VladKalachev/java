package com.itvdn.javaStarter;

public class C10_Ternary {
    // Тернарная условная операция.

    public static void main(String[] args) {
        double quantity = 10;    // Количество единиц товара.
        double price = 100;      // Цена за единицу товара.
        double discount = 0.75;  // Скидка на общую стоимость - 25%.
        double cost;             // Общая стоимость.

        // ЕСЛИ: Купили 10 единиц товара и больше. ТО: предоставить скидку в 25%. ИНАЧЕ: Скидку не предоставлять.

        cost = quantity >= 10 ? quantity * price * discount : quantity * price;

        System.out.println("Общая стоимость товара составляет: " + cost + " у.е.");
    }
}
