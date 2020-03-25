package com.company.patterns.factory_method;

/**
 * Create by corvax
 */
public class Cat implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
