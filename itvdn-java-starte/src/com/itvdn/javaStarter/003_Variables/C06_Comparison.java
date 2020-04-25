package com.itvdn.javaStarter;

public class C06_Comparison {
    public static void main(String[] args) {
        byte value1 = 0, value2 = 1;
        boolean result;

        // Less than
        result = value1 < value2;
        System.out.println(result);

        // Greater than
        result = value1 > value2;
        System.out.println(result);

        // Less than or equal to
        result = value1 <= value2;
        System.out.println(result);

        // Greater than or equal to
        result = value1 >= value2;
        System.out.println(result);

        // Equals
        result = value1 == value2;
        System.out.println(result);

        // Not equals
        result = value1 != value2;
        System.out.println(result);
    }

}
