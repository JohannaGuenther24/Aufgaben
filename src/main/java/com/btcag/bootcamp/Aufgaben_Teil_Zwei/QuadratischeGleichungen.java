package com.btcag.bootcamp.Aufgaben_Teil_Zwei;

public class QuadratischeGleichungen {
    public static void main(String[] args) {

        double a = 1;
        double b = 2.5;
        double c = 1;
        double diskriminante = 0;


        diskriminante = (b*b) - (4*a*c);

        if (diskriminante < 0) {
            System.out.println("Keine Lösung.");
        } else if (diskriminante == 0) {
            System.out.println("Ein Lösung.");
        } else {
            System.out.println("Zwei Lösungen.");
        }

    }
}
