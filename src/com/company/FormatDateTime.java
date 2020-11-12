package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class FormatDateTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, Month.NOVEMBER, 10);
        LocalTime time = LocalTime.of(19, 23);
        LocalDateTime dt = LocalDateTime.of(date, time);

        //format
        //buit-in formatter
        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

//        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_TIME));
//        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_DATE));

        //custom formatter
        var formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss");
        System.out.println(dt.format(formatter1));

        var formatter2 = DateTimeFormatter.ofPattern("MM_yyyy_-_dd");
        System.out.println(dt.format(formatter2));

        var formatter3 = DateTimeFormatter.ofPattern("h:mm z");
//        System.out.println(dt.format(formatter3));

        System.out.println(formatter1.format(dt));

        //Add custom text
        var f = DateTimeFormatter.ofPattern("MMMM dd, yyyy 'at' hh:mm");
        System.out.println(dt.format(f));

        var f1 = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        var f2 = DateTimeFormatter.ofPattern("hh:mm");
        System.out.println(dt.format(f1) + " at " + dt.format(f2));

        var g1 = DateTimeFormatter.ofPattern("MMMM dd, yyyy 'Party''s at' hh:mm");
        System.out.println(dt.format(g1));

        var g2 = DateTimeFormatter.ofPattern("'System format, hh:mm' hh:mm");
        System.out.println(dt.format(g2));

        var g3 = DateTimeFormatter.ofPattern("'New!' yyyy ',yay!!'");
        System.out.println(dt.format(g3));

//        DateTimeFormatter.ofPattern("Time is: hh:mm:ss");
//        DateTimeFormatter.ofPattern("'Time is: hh:mm:ss");

        //In java 7
        DateFormat s = new SimpleDateFormat("MMMM dd, yyyy 'at' hh:mm");
        System.out.println(s.format(new Date()));
    }
}