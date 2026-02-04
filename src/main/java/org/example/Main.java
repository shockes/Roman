package org.example;

import jdk.dynalink.beans.StaticClass;

public class Main {
    public static String ageCategory(int age){
        if (age < 18) {
            return "Ребенок";
    } else if (age < 40) {
            return "Взрослый";
    } else {
            return "Пенсионер";
    }
}
}