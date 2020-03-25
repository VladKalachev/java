package com.company.patterns.template_method;

/**
 * Create by corvax
 * <p>
 * Framework class in the Template method patten.
 */
public abstract class BinaryOperation {
    /*
        Common part of the subclasses.
     */
    private final int a;
    private final int b;

    BinaryOperation(int a, int b){
        this.a = a;
        this.b = b;
    }

    int getResult() {
        return apply(a, b);
    }

    /**
     * Different algorithms of the subclasses.
     *
     * @param a the first argument
     * @param b the second argument
     * @return result of the algorithm
     */
    protected abstract int apply(int a,int b);

}
