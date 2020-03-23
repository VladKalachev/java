package com.company;

/**
 * Работа с массивами и строками
 * <p>
 * class Object
 * == и equals()
 * массивы
 * String
 * StringBuilder
 * перегрузка методов
 * java.util.Arrays
 */


// java.lang.Object

import java.util.Arrays;

/**
 *  public String toString()
 *  public boolean equals(Object obj)
 *  public int hashCode()
 *  protecred Object clone()
 *
 *  public Class<?> getClass()
 *  public notify()
 *  public notifyAll()
 *  public wait()
 */


// Массивы
// массив приметивных типов
// массив ссылочных типов
// многомерные массивы

public class ExampleArrays {

    public static void main(String[] arrays) {
//      Object object = new Object();
//      System.out.println(object.toString());
//
//      MyClass myClass = new MyClass();
//      MyClass myClassTwo = new MyClass();
//
//      System.out.println(myClass.equals(object));

//        MyClass myClass1 = new MyClass();
//        MyClass myClass2 = new MyClass();
//        System.out.println(myClass1 == myClass2);
//        System.out.println(myClass1.equals(myClass2));

        // Arrays

//        int[] anArray = new int[10];
//        int[] anArray1 = {0, 1, 2, 3};
//        MyClass[] objArray = new MyClass[5];
//        System.out.println(anArray.toString());
//
//        for(int i = 0; i < objArray.length; i++){
//            objArray[i] = new MyClass(i);
//        }
//
//        for(int i =  0; i < objArray.length ; i++){
//            System.out.println(objArray[i]);
//        }

        // String
        // Создание строк
//        String str = "abcsv";
//        char data[] = {'a', 'b', 'c'};
//        String str1 = new String(data);
//        System.out.println(str);
//        System.out.println(str1);

        /**
         * Работа со строками
         *
         * int length()
         * boolean isEmpty()
         * char charAt(int index)
         * boolean startsWith(String prefix)
         * boolean endsWith(String suffix)
         * int indexOf(String str)
         * int lastIndexOf(String str)
         *
         * String substring(int beginIndex, int endIndex)
         * String replace(char oldChar, char newChar)
         * String toLowerCase()
         * String toUpperCase()
         * String trim() - убираем пустые символы
         * static String valueOf(int i) - строковое представление числа
         *
         */

//        System.out.println(str.indexOf('b'));

//        String str = "abc";
//        String str2 = new String(new char[]{'a', 'b', 'c'});
//
//        System.out.println(str);
//        System.out.println(str2);
//        System.out.println(str == str2);
//        System.out.println(str.equals(str2));
//
//        System.out.println("a" + "b" + "d");
//
//        String tmp = "";
//        for(int i = 0; i < 100; i++){
//            tmp += i + "_";
//        }
//        System.out.println(tmp);
//
//        // StringBuilder
//        StringBuilder tmp2 = new StringBuilder();
//        for(int i = 0; i < 100; i++){
//            tmp2.append(i).append("_");
//        }
//        System.out.println(tmp2.toString());

        /**
         * Перегрузка методов
         * Методы класса String
         *
         * String valueOf(byte b)
         * String valueOf(short s)
         * String valueOf(int i)
         * String valueOf(long i)
         * Отличаются только параметрами. Эти методы перегружены.
         *
         * Перегрузка (overload) != переопределение (override)
         */

        int[] values = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.binarySearch(values, 5));
    }

    private static void arrayExample() {
        int[] anArray1 = new int[10];
        int[] anArray2 = {0, 1, 2, 3};
        MyClass[] objArray = new MyClass[5];

        System.out.println(objArray.toString());
        for (int i = 0; i < objArray.length; i++) {
            objArray[i] = new MyClass(i);
        }

    }

}
