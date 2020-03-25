package com.company.patterns.adapter;

import sun.tools.jconsole.PlotterPanel;

/**
 * Create by corvax
 * <p>
 * PolarPlotter coordinated to CartesianPlotter coordinated adapter.
 */
public class Polar2CartesianAdapter implements PolarPlotter {
    private final CartesianPlotter cartesion;

    public Polar2CartesianAdapter(CartesianPlotter cartesion){
        this.cartesion = cartesion;
    }

    @Override
    public void setPoint(double r, double theta) {
        cartesion.setPoint(r * Math.cos(theta), r * Math.sin(theta));
    }
}
