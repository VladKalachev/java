package com.itvdn.javaStarter;

public class C09_LocalVariables {
    // Использование локальных областей и локальных переменных.

    public static void main(String[] args) {
        // ПРАВИЛО:
        // В коде можно создавать локальные области и в двух разных локальных областях хранить одноименные переменные.

        // Локальная область 1
        {
            int a = 1;
            System.out.println(a);
        }

        // System.out.println(a); // - ОШИБКА: Переменная объявлена в локальной области и не существует за её пределами.

        // Локальная область 2
        {
            int a = 2;
            System.out.println(a);
        }

        int a = 3;
        System.out.println(a);
    }
}
