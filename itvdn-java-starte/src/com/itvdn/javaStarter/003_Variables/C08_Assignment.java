package com.itvdn.javaStarter;

public class C08_Assignment {
    public static void main(String[] args) {
        // ПРАВИЛО:
        // Все арифметические операции производимые над двумя значениями типа (byte, short)
        // в качестве результата, возвращают значение типа int.

        // Присвоение со сложением для типа byte.
        byte variable1 = 0;

        //variable1 = variable1 + 5;       // ОШИБКА: Попытка неявного преобразования значения результата, тип int в тип byte.
        //variable1 = (byte)variable1 + 5; // ОШИБКА: Происходит преобразование типа byte в тип byte,  раньше выполнения операции сложения.

        variable1 = (byte)(variable1 + 5); // Громоздкое решение.

        variable1 += 5;                    // Элегантное решение.

        variable1 += 5000;               // Сужение типа.

        // ПРАВИЛО:
        // Для типов int и long, не происходит преобразования типа результата арифметических операций.

        // Операции присвоения с ...

        // Присвоение со сложением.
        int variable2 = 0;
        variable2 = variable2 + 5;
        variable2 += 5;

        // Присвоение с вычитанием.
        int variable3 = 0;
        variable3 = variable3 - 5;
        variable3 -= 5;

        // Присвоение с умножением.
        long variable4 = 0;
        variable4 = variable4 * 5;
        variable4 *= 5;

        // Присвоение с делением.
        long variable5 = 0;
        variable5 = variable5 / 5;
        variable5 /= 5;

        // Присвоение остатка от деления.
        long variable6 = 0;
        variable6 = variable6 % 5;
        variable6 %= 5;

        // ПРАВИЛО:
        // Для типов float и double, не происходит преобразования типа результата арифметических операций.

        // Присвоение со сложением.
        float variable7 = 0;
        variable7 = variable7 + 5;
        variable7 += 5;

        // Присвоение с умножением.
        double variable8 = 0;
        variable8 = variable8 * 5;
        variable8 *= 5;
    }
}
