package com.itvdn.javaStarter;

public class C08_DeMorganTheoremes {

     // Преобразования логических переменных в соответствии с теоремами Де Моргана.

     // Для применения теорем Де Моргана к логическому оператору AND или OR и паре операндов,
     // требуется инвертировать оба операнда, заменить (AND на OR) или (OR на AND) и
     // инвертировать все выражение полностью.

     //  Исходное выражение                           Эквивалентное выражение
     //     !A & !B                       =                  !(A | B)
     //     !A & B                        =                  !(A | !B)
     //     A & !B                        =                  !(!A | B)
     //     A & B                         =                  !(!A | !B)
     //     !A | !B                       =                  !(A & B)
     //     !A | B                        =                  !(A & !B)
     //     A | !B                        =                  !(!A & B)
     //     A | B                         =                  !(!A & !B)

    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // Условие до применения теоремы Де Моргана.
        if (!a || !b)
            System.out.println("!A || !B = " + (!a || !b));
        else
            System.out.println("!A || !B = " + (!a || !b));

        // Условие после применения теоремы Де Моргана.
        if (!(a && b))
            System.out.println("!(A && B) = " + !(a && b));
        else
            System.out.println("!(A && B) = " + !(a && b));
    }
}
