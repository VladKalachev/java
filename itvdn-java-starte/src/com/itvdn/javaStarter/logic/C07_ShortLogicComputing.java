package com.itvdn.javaStarter;

public class C07_ShortLogicComputing {

    //  КОРОТКОЗАМКНУТОЕ ВЫЧИСЛЕНИЕ - техника работающая по следующему принципу:
    //  Если значение первого операнда в операции AND (&&) ложно, то второй операнд не вычисляется,
    //  потому что полное выражение в любом случае будет ложным.

    public static void main(String[] args) {
        final int MIN_VALUE = 1;
        int denominator = 0;
        int item = 2;

        // Условие, которое работает с использованием техники КОРОТКОЗАМКНУТОГО ВЫЧИСЛЕНИЯ.
        // Если бы это выражение вычислялось полностью, то операция деления во втором операнде,
        // генерировала бы ошибку деления на 0.

        if ((denominator != 0) && (item / denominator) > MIN_VALUE) {   // Оставьте один оператор &
            System.out.println("Мы в блоке IF");
        } else {
            System.out.println("Мы в блоке ELSE");
        }
    }
}
