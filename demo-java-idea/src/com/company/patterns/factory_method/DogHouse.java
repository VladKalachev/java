package com.company.patterns.factory_method;

public class DogHouse extends AnimalHouse {
    @Override
    protected Animal createAnimal() {
        return new Dog();
    }
}
