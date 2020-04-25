package com.itvdn.javaStarter;

import java.util.Scanner;

public class Scannerz {
    public static void main(String[] args) {
        System.out.println("Just input smth:");

        Scanner input = new Scanner(System.in);
        String buffer = input.next();

        System.out.println(buffer);
    }
}
