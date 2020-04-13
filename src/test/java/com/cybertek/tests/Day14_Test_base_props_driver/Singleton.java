package com.cybertek.tests.Day14_Test_base_props_driver;


public class Singleton {
    //make constructor private, so no one will create with the same name
    private Singleton() {
    }

    private static String string;

    public static String getInstance() {
        if (string == null){
            string = "chrome";
        }
        return string;
    }

    }

