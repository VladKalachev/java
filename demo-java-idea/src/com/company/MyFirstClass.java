package com.company;

public class MyFirstClass {
    private int size = 0;

    MyFirstClass(int size){
        this.size = size;
    }

    public static void hello() {
        System.out.println("Hello My Firs Class");
    }

    void printBinary(long value){
        for (int i = size - 1; i >= 0; i--) {
            long mask = 1L << i;
            long result = (mask & value) >> i;
            System.out.print(result);
        }
        System.out.println();
    }

    int getSize(){
        return size;
    }

    void setSize(int size){
        this.size = size;
    }
}
