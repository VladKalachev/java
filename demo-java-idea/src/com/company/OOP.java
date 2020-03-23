package com.company;

import com.company.inheritance.POSIXTimeSupplier;
import com.company.inheritance.TimeSupplier;

/**
 * Объектно-ориентированное программирование
 *
 * Наследование extends
 * Полиморфизм
 * Абстракция, интерфейс, implements
 * Ссылки между объектами
 * Инкапсуляция, модификация доступа
 * Ключевое слово this и super
 * Generics
 */
public class OOP {
    private void printTime(TimeSupplier timeSupplier) {
        System.out.println("POSIX time:" + timeSupplier.getTime());
    }
    public static void main(String[] args){
        TimeSupplier timeSupplier = new POSIXTimeSupplier();
        new OOP().printTime(timeSupplier);
    }
}