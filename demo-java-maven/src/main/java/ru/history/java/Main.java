package ru.history.java;

/**
 * Устройство платформы Java
 *
 * Истоирия Java
 * Кроссплатформенность
 * JVM
 * JRE, JDK, Interpreter, JIT
 * Vm start paramerers
 */

/**
 * JVM
 * Interpreter
 * Just-In-Time (JIT) compil
 * Byte code verifier
 * Garbage collector (GC)
 */

/**
 * JVM (VM) - жава виртуальная машина ( виртуальная машина )
 * JRE - виртуальная машина и библиотека классов для чтения приложений ( не для разработки )
 * JDK - для разработки нуженг
 * Interpreter - интерпритатор ( интерпритирует byte code )
 * JIT - сервис внутри java машины
 * GC - сборщик мусора ( граф ссылок )
 * javac - java компилятор ( то что превращяет ваш код в byte code  )
 */

import java.util.Arrays;

/**
 * VM start parameters
 * Dproperty = value
 * Xmx
 * Xms
 * Xss
 * verbosegc
 * cp
 * jar
 */
public class Main {

    public static void main(String[] args) {
        Arrays.stream(args).forEach(System.out::println);

        String thredCount = System.getProperty("threadCount", "5");
        System.out.println(thredCount);
    }
}
