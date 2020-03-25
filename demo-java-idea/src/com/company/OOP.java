package com.company;

import com.company.inheritance.POSIXTimeSupplier;
import com.company.inheritance.TimeSupplierInterface;
import com.company.references.TimeHolder;

/**
 * Объектно-ориентированное программирование
 *
 * Наследование extends
 * Полиморфизм - подмена методов
 * Абстракция, интерфейс, implements
 * Ссылки между объектами
 * Инкапсуляция, модификация доступа
 * Ключевое слово this и super
 * Generics (классы, методы)
 */

/**
 *  Access Levels
 *  Modifier    / Class / Package / Subclass / World
 *  public      / Y     / Y       / Y        / Y
 *  protected   / Y     / Y       / Y        / N
 *  no modifier / Y     / Y       / N        / N
 *  private     / Y     / N       / N        / N
 */

public class OOP {
    private void printTime(TimeSupplierInterface timeSupplier) {
        System.out.println("POSIX time:" + timeSupplier.getTime());
    }
    public static void main(String[] args){
        TimeSupplierInterface timeSupplier = new POSIXTimeSupplier();
        // new OOP().printTime(timeSupplier);
        TimeHolder holder = new TimeHolder(timeSupplier);
        holder.printTime();
        holder.setTimeSupplier(new POSIXTimeSupplier());
        holder.printTime();
    }
}