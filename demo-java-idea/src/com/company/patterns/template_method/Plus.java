package com.company.patterns.template_method;

/**
 * Create by corvax
 */
public class Plus extends BinaryOperation {

    Plus(int a, int b){
        super(a, b);
    }

    @Override
    protected int apply(int a, int b){
        return a + b;
    }

}
