package com.company.patterns.factory_method;

/**
 * Create by corvax
 */
public class Dog implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}
