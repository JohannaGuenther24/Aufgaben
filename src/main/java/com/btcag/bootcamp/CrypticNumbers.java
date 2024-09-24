package com.btcag.bootcamp;

import java.util.Scanner;

public class CrypticNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte die Zahl eingeben: ");
        double zahl = sc.nextDouble();
        System.out.println("Bitte Passwort (Zahl) eingeben: ");
        double passwort = sc.nextDouble();

        double result = zahl / 5 * 6;
        System.out.println("Result: " + result);

        System.out.println("Bitte die Zahl eingeben: ");
        zahl = sc.nextDouble();
        System.out.println("Bitte Passwort (Zahl) eingeben: ");
        passwort = sc.nextDouble();

        result = passwort * 5 / 6;
        System.out.println("Result: " + result);


    }
}
