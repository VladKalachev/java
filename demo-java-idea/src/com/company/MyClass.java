package com.company;

import java.util.Objects;

public class MyClass {
    int a = 10;
    boolean t = true;

    @Override
    public String toString() {
        return "MyClass{" +
                "a=" + a +
                ", t=" + t +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyClass myClass = (MyClass) o;
        return a == myClass.a &&
                t == myClass.t;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, t);
    }
}
