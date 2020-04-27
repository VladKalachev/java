package com.itvdn.javaStarter.methods;

public class C03_Methods {

    static String function() {
        String word = "Hello!";
        return word;
    }

    public static void main(String[] args) {

        // В теле метода Main на 15-й строке, создаем строковую локальную переменную с именем string
        // и присваиваем ей возвращаемое значение метода function.

        //String string = function();
        System.out.println(function());
    }
}
