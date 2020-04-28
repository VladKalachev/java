package com.itvdn.javaStarter.methodsTwo;

public class C07_MethodsBinaryDigit {
    // Вывод в двоичном формате числа, переданного в десятичном формате

    static void converter(int n) {
        int temp;

        temp = n % 2;

        if (n >= 2)
            converter(n / 2);

        System.out.print(temp);
    }

    public static void main(String[] args) {
        int n = 6487;

        converter(n);
    }
}
