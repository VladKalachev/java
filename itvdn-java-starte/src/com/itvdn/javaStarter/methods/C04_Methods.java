package com.itvdn.javaStarter.methods;

public class C04_Methods {

    // На 9-й строке, создаем метод с именем function, который принимает один строковой аргумент и возвращает строковое значение.
    // В теле метода, строковой локальной переменной sentence, присваиваем конкатенацию строк и аргумента,
    // используя ключевое слово return, возвращаем значение переменной sentence.

    static String function(String name) {
        String sentence = "Hello " + name + "!";
        return sentence;
    }

    public static void main(String[] args) {

        // В теле метода Main на 19-й строке, создаем строковую локальную переменную с именем sentence,
        // присваиваем ей возвращаемое значение метода function, которому в качестве аргумента передаем строку - World.

        String sentence = function("World");
        System.out.println(sentence);
    }
}
