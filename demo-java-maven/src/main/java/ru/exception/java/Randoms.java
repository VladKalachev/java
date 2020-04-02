package ru.exception.java;

import java.util.Random;

public class Randoms {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt();
        System.out.println(i);
    }
}
