package com.company;

import java.time.*;

public class Main {

    public static void main(String[] args) {
        //now()
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());

        //Off()
        LocalDate date1 = LocalDate.of(2020, Month.NOVEMBER, 10);
        LocalDate date2 = LocalDate.of(2020, 11, 10);

        LocalTime time1 = LocalTime.of(19,23);
        LocalTime time2 = LocalTime.of(19,23, 59);
        LocalTime time3 = LocalTime.of(19,23, 59, 800);

        var dt1 = LocalDateTime.of(2020, Month.NOVEMBER,10,19,23,59);
        var dt2 = LocalDateTime.of(date1, time1);

        System.out.println(date1.getDayOfWeek());
        System.out.println(date1.getMonth());
        System.out.println(date1.getYear());
        System.out.println(date1.getDayOfYear());

    }
}