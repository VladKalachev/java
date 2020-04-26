package com.itvdn.javaStarter;

public class C04_Logic {
    // Логические операции.

    public static void main(String[] args) {
        boolean operand1 = false, operand2 = false, result = false;

        // Конъюнкция

        // Таблица истинности для Конъюнкции (И) - && - [AND]

        // Если хоть одно из выражений операции операции конъюнкции имеет значение false -
        // все выражение имеет значение false, иначе - true

        // false && false = false                  true && false = false
        // false && true = false                   true && true = true

        operand1 = true;                           // true
        operand2 = false;                          // false
        result = operand1 && operand2;             // false

        System.out.println(operand1 + " AND " + operand2 + " = " + result);

        // Дизъюнкция

        // Таблица истинности для Дизъюнкции (ИЛИ) - || - [OR]

        // Если хоть одно из выражений операции операции Дизъюнкции имеет значение true -
        // все выражение имеет значение true, иначе - false

        // false || false = false                  true || false = true
        // false || true = true                    true || true = true

        operand1 = true;                           // true
        operand2 = false;                          // false
        result = operand1 || operand2;             // true

        System.out.println(operand1 + " OR " + operand2 + " = " + result);

        // Исключающее ИЛИ

        // Таблица истинности для Исключающего ИЛИ - ^ - [XOR]

        // Если оба выражения операции Исключающего ИЛИ имеют одинакое значение -
        // все выражение имеет значение false, если разные - true

        // false ^ false = false                   true ^ false = true
        // false ^ true = true                     true ^ true = false

        operand1 = true;                           // true
        operand2 = false;                          // false
        result = operand1 ^ operand2;              // true

        System.out.println(operand1 + " XOR " + operand2 + " = " + result);

        // Отрицание

        // Таблица истинности для Отрицания (НЕТ) - ! - [NOT]

        // !false  = true
        // !true  = false

        operand1 = true;
        result = !operand1;

        System.out.println("NOT " + operand1 + " = " + result);
    }
}
