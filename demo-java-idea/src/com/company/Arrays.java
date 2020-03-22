package com.company;

/**
 *  Работа с массивами и строками
 *
 *  class Object
 *  == и equals()
 *  массивы
 *  String
 *  StringBuilder
 *  перегрузка методов
 *  java.util.Arrays
 */


// java.lang.Object
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

public class Arrays {

    public static void main(String[] arrays){
//      Object object = new Object();
//      System.out.println(object.toString());
//
//      MyClass myClass = new MyClass();
//      MyClass myClassTwo = new MyClass();
//
//      System.out.println(myClass.equals(object));

        MyClass myClass1 = new MyClass();
        MyClass myClass2 = new MyClass();
        System.out.println(myClass1 == myClass2);
        System.out.println(myClass1.equals(myClass2));
    }

}
