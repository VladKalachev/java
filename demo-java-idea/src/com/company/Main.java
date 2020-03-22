package com.company;

/**
 *  Ссылочные типы данных и обработка ошибок
 *  Создаем в хипе класс при его вызове через new
 */
public class Main {

    public static void main(String[] args) {

        MyFirstClass my = new MyFirstClass(16);

        System.out.println("Original size:" + my.getSize());

        //  my.size = 16;
        my.setSize(1);
        System.out.println("Change size:" + my.getSize());
        // my.hello();
        my.printBinary(12);
    }
}
