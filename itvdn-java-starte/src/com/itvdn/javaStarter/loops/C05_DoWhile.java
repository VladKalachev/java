package com.itvdn.javaStarter.loops;

public class C05_DoWhile {
    // Циклическая конструкция - do-while.

    public static void main(String[] args) {
        int counter = 0;

        do {
            counter++;
            System.out.println("Counter " + counter);
        } while (counter > 3);

        System.out.println("Произведено " + counter + " итераций.");
    }
}
