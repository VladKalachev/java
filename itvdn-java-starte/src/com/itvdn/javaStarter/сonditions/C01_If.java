package com.itvdn.javaStarter;

public class C01_If {
    public static void main(String[] args) {
        int a = 1, b = 2; // создаем две целочисленные переменные

        // На 9-й строке создаем условную конструкцию if, в условии которой проверяем: a меньше b

        if (a < b) {     // Если условие удовлетворяет истинности, выполняем тело условной конструкции.
            System.out.println("a < b");     // Ветвь 1
        }
    }
}
