package com.company.patterns.adapter;

/**
 * Create by corvax
 */
public class CartesianPlotterlmpl implements CartesianPlotter {

    @Override
    public void setPoint(double x, double y) {
        System.out.println("x: " + x + " y " + y);
    }
}
