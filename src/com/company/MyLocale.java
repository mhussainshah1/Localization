package com.company;

import java.util.Locale;

public class MyLocale {
    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println(locale);//en_US

        //Select Locale
        System.out.println(Locale.GERMAN);//de
        System.out.println(Locale.GERMANY);//de_DE

        //2
        System.out.println(new Locale("fr"));//fr
        System.out.println(new Locale("ur","PK"));//ur_PK
        System.out.println(new Locale("xx","XX"));

        //3
        Locale l1 = new Locale.Builder()
                .setLanguage("hi")
                .setRegion("IN")
                .build(); //hi_IN

        Locale l2 = new Locale.Builder()
                .setRegion("IN")
                .setLanguage("hi")
                .build(); //hi_IN

        //set local
        locale = new Locale("fr");
        Locale.setDefault(locale);
        System.out.println(Locale.getDefault());

    }
}
