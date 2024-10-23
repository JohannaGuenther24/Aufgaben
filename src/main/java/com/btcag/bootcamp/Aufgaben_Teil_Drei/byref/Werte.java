package com.btcag.bootcamp.Aufgaben_Teil_Drei.byref;

public class Werte {
    static int value;

    public static void doubleValue(int value){
        Werte.value = value * 2;
        System.out.println(Werte.value);
    }
}
