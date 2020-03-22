package com.company;

public class MyFirstClass {

    private static int DEFAULT_SIZE = 0;
    private int size = DEFAULT_SIZE;
    public String name = "MyFirstClass";

    MyFirstClass(int size){
        this.size = size;
    }

    public static void hello() {
        System.out.println("Hello My Firs Class");
    }

    // package visible
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

    void setSize(int size) throws Exception {
        if(size <= 0) {
            throw new Exception("Illeagel size: " + size);
        }
        this.size = size;
    }
}
