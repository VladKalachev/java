package com.company.patterns.observer;

/**
 * Create by corvax
 */
public class OutObserver implements Observer {

    @Override
    public void notify(Event event) {
        System.out.println(event.getClass());
    }
}
