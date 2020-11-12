package com.company.resource;

import java.util.Locale;
import java.util.ResourceBundle;

public class MyResourceBundle {
    public static void main(String[] args) {
        var us = new Locale("en","US");
        var fr = new Locale("fr", "FR");
        print(us);
        print(fr);

        var rb1 = ResourceBundle.getBundle("Zoo" , us);
        rb1.keySet().stream()
                .map(k -> k +": " + rb1.getString(k))
                .forEach(System.out::println);
    }

    private static void print(Locale locale) {
        var rb = ResourceBundle.getBundle("Zoo" , locale);
        System.out.println(rb.getString("hello") + ", " + rb.getString("open"));
    }
}
