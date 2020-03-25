package com.company.patterns.observer;

/**
 * Create by corvax
 * <p>
 * Abstract observer in the Observer interface
 */
@FunctionalInterface
public interface Observer {
    void notify(Event event);
}
