package com.btcag.bootcamp;

import java.util.Scanner;

public class Supermarket {
    public static void main(String[] args) {
        int ende = 1;
        int gesamtCent = 0;
        int euro = 0;
        int cent = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte alle Produkt in Cent eingeben und mit 0 die Liste beenden.");

        while (ende == 1) {

            int betrag = sc.nextInt();
            gesamtCent = betrag + gesamtCent;
            while (betrag == 0) {
                ende = 0;
                break;
            }
        }

        euro = gesamtCent / 100;
        cent = gesamtCent % 100;

        System.out.println("Die Summe alle Produkte ist " + euro + " € und " + cent + " Cent");

        System.out.println("Wieviel hat der Kunde eingeben (in Cent)?");
        int kundeCent = sc.nextInt();

        int rueckgabe = kundeCent - gesamtCent;
        System.out.println(rueckgabe);

        euro = rueckgabe / 100;
        cent = rueckgabe % 100;

        System.out.println("Bitte folgendes Geld zurückgeben (" + euro + " € " + cent + " Cent)");

        int euro200 = euro / 200;
        euro = euro % 200;

        int euro100 = euro / 100;
        euro = euro % 100;

        int euro50 = euro / 50;
        euro = euro % 50;

        int euro20 = euro / 20;
        euro = euro % 20;

        int euro10 = euro / 10;
        euro = euro % 10;

        int euro5 = euro / 5;
        euro = euro % 5;

        int euro2 = euro / 2;
        euro = euro % 2;

        int euro1 = euro;

        System.out.print(euro200 + " x 200€\n" + euro100 + " x 100€\n" + euro50 +" x 50€\n" + euro20 +" x 20€\n" + euro10 +" x 10€\n" + euro5 + " x 5€\n" + euro2 + " x 2€\n" + euro1 +" x 1€\n");

        int cent50 = cent / 50;
        cent = cent % 50;

        int cent20 = cent / 20;
        cent = cent % 20;

        int cent10 = cent / 10;
        cent = cent % 10;

        int cent5 = cent / 5;
        cent = cent % 5;

        int cent2 = cent / 2;
        cent = cent % 2;

        int cent1 = cent;

        System.out.println( cent50 + " x 50 Cent\n" + cent20 + " x 20 Cent\n" + cent10 + " x 10 Cent\n" + cent5 +" x 5 Cent\n" + cent2 + " x 2 Cent\n" + cent1 +" x 1 Cent\n");
    }
}
