package ru.exception.java;

import java.util.Calendar;
import java.util.Date;

public class DateTime {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        long time = d.getTime();
        Date d2 = new Date(time);
        System.out.println(d2);

        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        c.set(2020, Calendar.JANUARY, 20);
        System.out.println(c.getTime());
        c.set(Calendar.HOUR_OF_DAY, 10);
        c.set(Calendar.MINUTE, 20);
        System.out.println(c.getTime());
    }
}
