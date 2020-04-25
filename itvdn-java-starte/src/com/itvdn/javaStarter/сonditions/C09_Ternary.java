package com.itvdn.javaStarter;

public class C09_Ternary {
    // Тернарная условная операция. Вложенные тернарные операторы.

    public static void main(String[] args) {
        // Определение квадранта в котором лежит заданная точка.
        // Для упрощения примера условимся, что точка не будет лежать в центре координат и на координатных осях,
        // это значит, что x и y - не могут быть равны 0.

        int x = 10, y = -5;
        String quadrant0, quadrant1,quadrant2;


        // Не рекомендуется вкладывать тернарные операторы, так как это ухудшает чтение кода.

        //                   condition    true block    false block     condition   true block       false block
        //                    -------- ? ------------ : -------------    -------- ? ------------- : --------------
        quadrant0 = (x > 0) ? ((y > 0) ? "I квадрант" : "IV квадрант") : ((y > 0) ? "II квадрант" : "III квадрант");
        //          ------- ? ---------------------------------------- : -------------------------------------------
        //         condition               true block                                   false block

        // ... или так

        quadrant1 = x > 0 ? (y > 0 ? "I квадрант" : "IV квадрант") : (y > 0 ? "II квадрант" : "III квадрант");

        // ... или вообще, вот так

        quadrant2 = x > 0 ? y > 0 ? "I квадрант" : "IV квадрант" : y > 0 ? "II квадрант" : "III квадрант";

        System.out.println(quadrant0);
        System.out.println(quadrant1);
        System.out.println(quadrant2);
    }
}
