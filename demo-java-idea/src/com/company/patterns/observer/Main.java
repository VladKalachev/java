package com.company.patterns.observer;

public class Main {
    public static void main(String[] args){
        ErrorsReporter errorsReporter = new ErrorsReporter();

        Observer o1 = new OutObserver();

        errorsReporter.reqister(o1);
        errorsReporter.reqister(new OutObserver());
        errorsReporter.reqister(new ErrObserver());

        errorsReporter.unregister(o1);

        errorsReporter.notify(new Event());
    }
}
