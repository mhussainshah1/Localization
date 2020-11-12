package com.company.resource;

import java.util.Locale;
import java.util.ResourceBundle;

public class PickingResourceBundle {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en","US"));//default locale
        Locale locale = new Locale("fr","FR"); //requested locale

        var rb = ResourceBundle.getBundle("Zoo");
        System.out.println(rb.getString("name"));
        /**
         * Zoo_en_US
         * Zoo_en
         * Zoo
         */

        rb = ResourceBundle.getBundle("Zoo" ,locale);
        System.out.println(rb.getString("name"));
        /**
         * Zoo_fr_FR
         * Zoo_fr
         * Zoo
         *
         * if requested locale(language,country) not present
         * ------------------------------------------------
         * Zoo_en_US
         * Zoo_en
         * Zoo
         */

        rb = ResourceBundle.getBundle("Zoo" ,locale);
        System.out.print(rb.getString("hello"));
        System.out.print(".");
        System.out.print(rb.getString("text"));
        System.out.print(" ");
        System.out.print(rb.getString("open"));
        System.out.print(" ");
        System.out.print(rb.getString("visitors"));


    }
}
