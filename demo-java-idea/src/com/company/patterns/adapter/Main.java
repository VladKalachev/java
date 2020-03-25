package com.company.patterns.adapter;

/**
 * Create by corvax
 * <p>
 *  Client in the Adapter pattern
 */
public class Main {
    public static void main(String[] args){
        CartesianPlotter plotter = new CartesianPlotterlmpl();
        PolarPlotter adapter = new Polar2CartesianAdapter(plotter);

        adapter.setPoint(0, 42);
        adapter.setPoint(1, Math.PI / 2);
        adapter.setPoint(2, Math.PI);
    }
}
