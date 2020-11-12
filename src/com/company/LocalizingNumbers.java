package com.company;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class LocalizingNumbers {
    public static void main(String[] args) throws ParseException {
        //formatting
        //numbers
        int attendeesPerYear = 3_200_000;
        int attendeesPerMonth = attendeesPerYear / 12;

        var us = NumberFormat.getInstance(Locale.US);
        System.out.println(us.format(attendeesPerMonth));//266,666

        var gr = NumberFormat.getInstance(Locale.GERMANY);
        System.out.println(gr.format(attendeesPerMonth));//266.666

        var ca = NumberFormat.getInstance(Locale.CANADA_FRENCH);
        System.out.println(ca.format(attendeesPerMonth));//266 666

        //currency
        Locale.setDefault(new Locale("en","GB"));
        double price =40;
        var myLocale = NumberFormat.getCurrencyInstance();
        System.out.println(myLocale.format(price));//£40.00

        //parsing
        //number
        Locale.setDefault(new Locale("en","US"));
        String s ="40.45";
        var en =NumberFormat.getInstance();
        System.out.println(en.parse(s));
        var fr =NumberFormat.getInstance(Locale.FRANCE);
        System.out.println(fr.parse(s));

        //currency
        String income = "$92,807.99";
        var cf = NumberFormat.getCurrencyInstance();
        double value = (Double)cf.parse(income);
        System.out.println(value);

        //Custom Formatting
        //number
        double d = 1234567.467;
        NumberFormat f1 = new DecimalFormat("###,###,###.0");
        System.out.println(f1.format(d));//1,234,567.5

        NumberFormat f2 = new DecimalFormat("000,000,000.00000");
        System.out.println(f2.format(d));//001,234,567.46700

        //currency
        NumberFormat f3 = new DecimalFormat("$#,###,###.##");
        System.out.println(f3.format(d));//$1,234,567.47

    }
}
