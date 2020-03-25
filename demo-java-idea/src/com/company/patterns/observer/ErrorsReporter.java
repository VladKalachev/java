package com.company.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by corvax
 * <p>
 * ErrorsReporter in the Observer pattern.
 */
public class ErrorsReporter {
    private final List<Observer> observers = new ArrayList<>();

    /**
     * requster new observer.
     *
     * @param observer tp reqister
     */
    void reqister(Observer observer) {
        observers.add(observer);
    }

    /**
     * remove observer from the list
     *
     * @param observer to remove
     */
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Send notification
     *
     * @param event with details.
     */
    void notify(Event event) {
        observers.forEach(observer -> observer.notify(event));
    }
}
