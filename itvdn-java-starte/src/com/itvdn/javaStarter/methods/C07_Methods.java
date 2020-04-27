package com.itvdn.javaStarter.methods;

public class C07_Methods {
    // Пример правильного множественного возврата из метода.

    static String compare(int value1, int value2) {
        if (value1 < value2) {
            return "Comparison Less Than";
        } else if (value1 > value2) {
            return "Comparison Greater Than";
        }
        return "Comparison Equal";
    }

    public static void main(String[] args) {
        int operand1 = 1, operand2 = 2;

        String result = compare(operand1, operand2);
        System.out.println(result);
    }
}
