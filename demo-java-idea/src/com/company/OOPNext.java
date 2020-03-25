package com.company;

import com.company.bad.Bird;
/**
 * Концепции ООП
 *
 * Проблемы проектирования
 * Концепции ООП
 *  наследование
 *  полиморфизм
 *  инкапсуляция
 *  абстракция
 *
 * Нотации UML
 * Базовые паттерны
 */
public class OOPNext {

    public static void main(String[] args) {
        /**
         * Проблемы проектирования
         *
         * - Повторное использование кода
         * - Модульность
         * - Тестируемость
         */

        Bird[] birds = new Bird[]{
                new Bird("Crow"),
                new Bird("Blacbird")
        };
//        Bird bird1 = new Bird("Crow");
//        Bird bird2 = new Bird("Blacbird");

        new OOPNext().print(birds);
    }

    private void print(Bird[] birds) {
//        for(int i = 0; i < birds.length; i ++){
//            birds[i];
//        }
        for(Bird bird: birds){
            System.out.println(bird.getName());
        }
    }

}
