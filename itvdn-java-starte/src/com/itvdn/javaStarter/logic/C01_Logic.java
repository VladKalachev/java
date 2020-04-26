package com.itvdn.javaStarter;

public class C01_Logic {
    // Побитовые логические операции.

    public static void main(String[] args) {
        byte operand1, operand2;
        int result;

        // Конъюнкция

        // Таблица истинности для операций Конъюнкции (И) - & - [AND]

        // Если хоть один из операндов имеет значение 0 - вся конструкция имеет значение 0. Иначе - 1

        //    0 & 0 = 0         1 & 0 = 0
        //    0 & 1 = 0         1 & 1 = 1

        operand1 = 127;                             // [0111 1111 Bin] = [FF Hex] = [127 Dec]
        operand2 = 1;                               // [0000 0001 Bin] = [01 Hex] = [01 Dec]
        result = operand1 & operand2;               // [0000 0001 Bin] = [01 Hex] = [01 Dec]

        System.out.println(operand1 + " AND " + operand2 + " = " + result);

        // Дизъюнкция

        // Таблица истинности для Дизъюнкции (ИЛИ) - | - [OR]

        // Если хоть один из операндов имеет значение 1 - вся конструкция имеет значение 1. Иначе - 0

        //    0 | 0 = 0         1 | 0 = 1
        //    0 | 1 = 1         1 | 1 = 1

        operand1 = 2;                       // [0000 0010 Bin] = [02 Hex] = [02 Dec]
        operand2 = 1;                       // [0000 0001 Bin] = [01 Hex] = [01 Dec]
        result = operand1 | operand2;       // [0000 0011 Bin] = [03 Hex] = [03 Dec]

        System.out.println(operand1 + " OR " + operand2 + " = " + result);

        // Исключающее ИЛИ

        // Таблица истинности для Исключающего ИЛИ - ^ - [XOR]

        // Если операнды имеют одинаковое значение - результат операции 0,
        // Если операнды разные - 1

        //    0 ^ 0 = 0         1 ^ 0 = 1
        //    1 ^ 1 = 0         0 ^ 1 = 1

        operand1 = 3;                               // [0000 0011 Bin] = [03 Hex] = [03 Dec]
        operand2 = 1;                               // [0000 0001 Bin] = [01 Hex] = [01 Dec]
        result = operand1 ^ operand2;               // [0000 0010 Bin] = [02 Hex] = [02 Dec]

        System.out.println(operand1 + " XOR " + operand2 + " = " + result);

        // Отрицание

        // Таблица истинности для Отрицания (НЕТ) - ~ - [NOT]

        // ~ 0  = 1
        // ~ 1  = 0

        operand1 = 1;             // [0000 0001] = [01 Dec]
        result = ~operand1;       // [1111 1110] = [-2 Dec]

        System.out.println("NOT " + operand1 + " = " + result);

        // Изменение знака числа

        // Формула изменения знака числа, с (+N) на (-N) или наоборот.

        // Для того, чтобы сменить знак числа, необходимо:
        // выполнить его отрицание, а результат увеличить на 1.

        //  ~  +N + 1 = -N
        //  ~  -N + 1 = +N

        operand1 = 1;                               // [0000 0001]
        result = ~operand1;                         // [1111 1110]
        result++;                                   // [1111 1111]

        System.out.println("NOT " + operand1 + " + 1 = " + result);
    }
}
