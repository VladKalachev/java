package com.itvdn.javaStarter;

public class C03_IfElseShort {
    public static void main(String[] args) {
        int a = 1, b = 2;

        // Если тело блока if или else состоит из одного выражения, то операторные скобки можно опустить

        if (a < b)
            System.out.println("a меньше b");      // Ветвь 1
        else
            System.out.println("a не меньше b");   // Ветвь 2
    }
}