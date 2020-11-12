package com.company;

import java.util.Properties;

public class ZooOptions {
    public static void main(String[] args) {
        var prop = new Properties();
        prop.setProperty("name","Our Zoo");
        prop.setProperty("open","10am");

        System.out.println(prop.getProperty("camel"));//null
        System.out.println(prop.getProperty("camel", "Bob"));//Bob
        System.out.println(prop.getProperty("name", "Bob"));//Our Zoo

        prop = new Properties();
        prop.put("tigerAge","4");
        prop.put("lionAge",5);

        System.out.println(prop.getProperty("tigerAge"));//4
        System.out.println(prop.getProperty("lionAge"));//null
        System.out.println(prop.get("lionAge"));//5
    }
}
