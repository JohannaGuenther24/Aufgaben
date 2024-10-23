package com.btcag.bootcamp.Aufgaben_Teil_Eins;

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        System.out.println("Bitte Zahl für die Primfaktorzerlegung eingeben.");
        Scanner scanner = new Scanner(System.in);
        int eingabe = scanner.nextInt();
        int teiler = eingabe - 1;
        int zaehler = eingabe -1;
        int ergebnis = 0;

        while (zaehler > 1) {
            int rest = eingabe % teiler;

            while (rest == 0) {
                System.out.print(teiler+" ");
                rest = 1;

            }
            teiler--;
            zaehler--;
        }


    }
}
