package com.btcag.bootcamp.Aufgaben_Teil_Eins;

import java.util.Scanner;

public class PrimeTest {
    public static void main(String[] args) {
        System.out.println("Bitte Zahl für den Primetest eingeben.");
        Scanner scanner = new Scanner(System.in);
        int eingabe = scanner.nextInt();
        int teiler = eingabe - 1;
        int zaehler = eingabe -1;

        while (zaehler > 1) {
            int rest = eingabe % teiler;
            //System.out.println(eingabe+ "" +teiler);
            teiler--;
            zaehler--;
            //System.out.println(rest);

            while (rest == 0) {
                zaehler = 0;
                rest = 1;
                System.out.println("Ergebnis: false");
            }
            while (zaehler == 2) {
                System.out.println("Ergebnis: true");
                zaehler = 1;

            }
        }


    }
}
