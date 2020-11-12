package com.company.resource;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class FormattingMessages {
    public static void main(String[] args) {
        var us = new Locale("en" , "US");
        var rb = ResourceBundle.getBundle("Zoo",us);
        String format = rb.getString("helloByName");
        System.out.println(MessageFormat.format(format,"Muhammad","Shah"));
    }
}
