package ru.my.good;

public abstract class Bird {
    private boolean isFlying;
    private final String name;

    public Bird(String name) {
        if(name.isEmpty()){
            throw new RuntimeException("Name cam't be empty");
        }
        this.isFlying = false;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isFlying() {
        return isFlying;
    }

    public abstract void feed();

    protected void setFlying(boolean flying) {
        isFlying = flying;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "isFlying=" + isFlying +
                ", name='" + name + '\'' +
                '}';
    }
}
