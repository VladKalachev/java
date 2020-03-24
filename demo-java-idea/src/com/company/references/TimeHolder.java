package com.company.references;

import com.company.inheritance.TimeSupplierInterface;

public class TimeHolder {
    private TimeSupplierInterface timeSupplier;

    public TimeHolder(TimeSupplierInterface timeSupplier) {
        this.timeSupplier = timeSupplier;
    }

    public void printTime() {
        System.out.println("POSIX: " + timeSupplier.getTime());
    }

    public void setTimeSupplier(TimeSupplierInterface timeSupplier) {
        this.timeSupplier = timeSupplier;
    }
}