package com.company.patterns.factory_method;

/**
 * Create by corvax
 */
public class CatsHouse extends AnimalHouse {
    @Override
    protected Animal createAnimal() {
        return new Cat();
    }
}
