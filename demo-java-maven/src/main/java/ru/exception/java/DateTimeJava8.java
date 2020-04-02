package ru.exception.java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeJava8 {
    public static void main(String[] args) {
        LocalDate data = LocalDate.now();
        System.out.println(data);
        LocalDateTime d = LocalDateTime.now();
        System.out.println(d);

        LocalTime time = LocalTime.parse("10:15:20");
        System.out.println(time);
        LocalDateTime time1 = d
                .withHour(5)
                .withMinute(10)
                .withSecond(0);
        System.out.println(time1);
        LocalDateTime plus = time1.plus(-1, ChronoUnit.YEARS);
        System.out.println(plus);

        LocalDate vicrory = LocalDate.of(1945,5,9);
        Period period = Period.between(vicrory, LocalDate.now());
        System.out.println(period.getYears());
        System.out.println(period.getDays());
    }
}
