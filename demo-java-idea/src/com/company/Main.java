package com.company;

/**
 *  Ссылочные типы данных и обработка ошибок
 *  Создаем в хипе класс при его вызове через new
 *
 *  1. Класс и объект, создание объекта
 *  2. Поля и методы классов
 *  3. Области видисости переменных
 *  4. Передача про ссылке
 *  5. Исключетельная ситуация, Stake trace ошибки
 *
 */
public class Main {

    public static void main(String[] args) {

        MyFirstClass printer = createPrinter(16);

        System.out.println("Size:" + printer.getSize());

        printer.printBinary(12);

        System.out.println(printer.name);

        // printer.setSize(-1);

        doPrint(printer, -1);
    }

    public static MyFirstClass createPrinter(int size){
        return new MyFirstClass(size);
    }

    public static void doPrint(MyFirstClass printer, int value){
        printer.printBinary(value);
        try {
            printer.setSize(value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
