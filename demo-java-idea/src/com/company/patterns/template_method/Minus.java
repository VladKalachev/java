package com.company.patterns.template_method;

/**
 * Create by corvax
 */
public class Minus extends BinaryOperation {
    Minus(int a, int b){
        super(a, b);
    }

    @Override
    protected int apply(int a, int b){
        return a - b;
    }
}
