package com.company;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class LocalizingDates {
    public static void print(DateTimeFormatter dtf, LocalDateTime dateTime, Locale locale){
        System.out.println(dtf.format(dateTime) + ", " + dtf.withLocale(locale).format(dateTime));
    }
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en","US"));
        var italy = new Locale("it","IT");
        var dt = LocalDateTime.of(2020, Month.NOVEMBER,12,19,23,55);

        print(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT),dt,italy);
        print(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT),dt,italy);
        print(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT,FormatStyle.SHORT),dt,italy);

    }
}
