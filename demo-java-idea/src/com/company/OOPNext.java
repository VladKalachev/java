package com.company;

import com.company.good.Bird;
import com.company.good.Blackbird;
import com.company.good.Crow;

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

/**
 * Базовые паттерны
 * - Singleton
 * - Template method
 * - Factory method
 * - Adapter
 * - Observer
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
                new Crow("Crow"),
                new Blackbird("Blacbird")
        };

        birds[0].feed();
        birds[1].feed();

        new OOPNext().print(birds);
    }

    private void print(Bird[] birds) {
//        for(int i = 0; i < birds.length; i ++){
//            birds[i];
//        }
        for(Bird bird: birds){
            System.out.println(bird.toString());
        }
    }

}
