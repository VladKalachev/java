package com.company.patterns.singleton;

/**
 * Create by corvax
 */
public class Main {
    public static void main(String[] args){
        Singleton.instance().setMessage("Hello");

        new Main().print();
    }

    private void print() {
        System.out.print(Singleton.instance().getMessage());
    }
}
