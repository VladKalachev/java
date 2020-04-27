package com.itvdn.javaStarter.methods;

public class C02_Methods {
    // Методы (Функции).

    // На 9-й строке, создаем метод с именем function, который ничего не принимает и возвращает строковое значение.
    // В теле метода, используя ключевое слово return, возвращаем строку - Hello!

    static String function() {
        return "Hello!";
    }

    public static void main(String[] args) {

        // В теле метода Main на 18-й строке, создаем строковую локальную переменную с именем string
        // и присваиваем ей возвращаемое значение метода function.

        String string = function();
        System.out.println(string);
    }
}
