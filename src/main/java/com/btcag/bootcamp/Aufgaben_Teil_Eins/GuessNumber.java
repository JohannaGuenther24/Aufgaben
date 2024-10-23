package com.btcag.bootcamp.Aufgaben_Teil_Eins;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int zaehler = 1;
        int reichweite = 0;
        int bit = 1;
        int versuche = 1;
        boolean auswertung = false;

        System.out.println("Bitte gebe die Zahlengröße in Bits an:");
        int bits = sc.nextInt();

        while (zaehler <= bits) {
            reichweite = reichweite + bit;
            bit = bit * 2;
            zaehler++;
        }

        long zahl = random.nextLong(reichweite);


        while (auswertung == false) {
            System.out.println(versuche + ". Versuch: Bitte eine Zahl im Bereich 0 und " + reichweite + " angeben:");
            int raten = sc.nextInt();
            while (raten == zahl) {
                auswertung = true;
                System.out.println("Super!");
                break;
            }
            versuche++;
            while (raten < zahl) {
                System.out.println("Die gesuchte Zahl ist groesser!\n");
                break;
            }
            while (raten > zahl){
                System.out.println("Die gesuchte Zahl ist kleiner!\n");
                break;
            }
        }
    }
}
