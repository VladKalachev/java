/**
 * Базовые синтаксические конструкции и операторы в Java
 * 
 * 1. Типы данных, базовые типы данных
 * 2. Преобразование типов
 * 3. Битовые операторы, битовые маски
 * 4. Логические и математические операции
 * 5. Приоритеты
 * 6. Управление логикой работы приложения
 * 7. Циклы
 * 8. Структура консольного Java-приложения
 */


public class primitive {

    public static void main(String[] args) {
        // System.out.println("Hello World");

        // 1. Типы данных, базовые типы данных
        // 9 типов данных =  8 приметивных типов + 1 ссылочный

        // 4 целочисленных типа данных
        // - byte(1) -128 -> 127; 
        // - short(2) -32768 -> 32767;
        // - int(4) -2147483648 -> 2147483647;
        // - long(8) -9223372036854775808 -> 9223372036854775807;

        // - boolean(1), char(2), float(4), double(8)
        // - Ссылочный тип данных

        // byte a = 0;
        // a = 1;
        // printBinaty(a, 8);
        // a = -128;
        // printBinaty(a, 8);

        // int a = Short.MAX_VALUE;
        // System.out.println("a = " + a);
        // printBinaty(a, 32);

        //char a = ']';
        // System.out.println("a = " + a);
        // printBinaty(a, 32);

        // float a = 37.1f;
        // System.out.println("a = " + a);

        // double a = 34.1;
        // System.out.println("a = " + a);

        // 2. Преобразование типов
        // short a = 10;
        // int b = a;
        // System.out.println("a = " + b);

        // int a = 128;
        // byte s = (byte) a;
        // System.out.println("a = " + s); // -128

        // явное приведение типов (char) ???
        // short a = 127;
        // char s = (char)a;
        // System.out.println("a = " + s);

        // 3. Битовые операторы, битовые маски
        // &, |, ^ - ксор ( исключающая или )
        // <<, >>, >>>, ~

        //  int a = 9;
        //  printBinaty(a, 4);
        //  int b = 5;
        //  printBinaty(b, 4);
        //  printBinaty(b^a, 4);

        //  a = a^b;
        //  b = a^b;
        //  a = a^b;

        //  System.out.println("a = " + a);
        //  System.out.println("b = " + b);

        // int a = 1;
        // printBinaty(a, 32);

        // int b = a << 5;
        // printBinaty(b, 32);
        // System.out.println(b);

        // 4. Логические и математические операции
        // int a = 1;
        // int b = 0;

        // boolean c = a && b;
        // boolean c = a || b;
        // boolean c = !a;
        // boolean c = a != b;
        // System.out.println(c);

        // 5. Приоритеты
        // int a = 1;
        // System.out.println(++a);
        // System.out.println(a--);
        // System.out.println(a);

        // 6. Управление логикой работы приложения
        // if, else, else if, switch

        // int hour = 21;

        // boolean isWorkTime = hour >=9 && hour < 21;
        // if(isWorkTime) {
        //     System.out.println("Hello!");
        // } else if(hour == 21){
        //     System.out.println("Have a good night");  
        // } else {
        //     System.out.println("Bay");
        // }

        // int count = 10;

        // switch(count){
        //     case 1:
        //         System.out.println("0%");
        //         break;
        //     case 2:
        //         System.out.println("10%");
        //         break;
        //     default:
        //         System.out.println("50%");
        // }

        // 7. Циклы
        // for, while, do while

        // for(int i = 0; i < 32; i++){
        //     System.out.println(i);
        // }

        // int i = 0;
        // while(i < 32){
        //     System.out.println(i);
        //     i++;
        // }

        // int i = 0;
        // do {
        //     System.out.println(i);
        //     i++;
        // }while(i < 32);
  
    }

    private static void printBinaty(long value, int size) {
        for(int i = size - 1; i >= 0; i-- ){
            long mask = 1 << i;
            long result = (mask & value) >> i;
            System.out.print(result);
        }
        System.out.println();
    }
}