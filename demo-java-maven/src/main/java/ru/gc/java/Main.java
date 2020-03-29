package ru.gc.java;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Сборка мусора и отладка
 *
 * Логирование
 * Отладка
 * Remote debug
 * jconsole
 * JMX, MBeans
 * Сборка мусора
 * Виды GC, алгоритмы GC
 * GC roots
 * Типы ссылок
 */
public class Main {
    private static Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        System.out.println(String.format("Out message %s number: %d", "sting", 10));
        System.err.println("Err message");

        logger.info("Server started");
        logger.log(Level.SEVERE, "Can't open file");
    }
}
