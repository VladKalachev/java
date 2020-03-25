package com.company.good;

public class Bird {
    private boolean isFlying;
    private final String name;

    public Bird(String name) {
        this.isFlying = false;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isFlying() {
        return isFlying;
    }

    public void feed() {

    }
}
