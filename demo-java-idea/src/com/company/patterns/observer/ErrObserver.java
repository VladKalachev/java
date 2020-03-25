package com.company.patterns.observer;

/**
 * Create by corvax
 */
public class ErrObserver implements Observer {
    @Override
    public void notify(Event event) {
        System.err.println(event.getClass());
    }
}
