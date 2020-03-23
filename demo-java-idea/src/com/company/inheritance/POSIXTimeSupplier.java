package com.company.inheritance;

public class POSIXTimeSupplier extends TimeSupplier{
    public long getTime() {
        return System.currentTimeMillis()/1000;
    }
}
