package com.btcag.bootcamp;

import java.util.Scanner;

public class Rectangular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Flaechenberechnung eines Rechtecks");
        System.out.println("Bitte geben Sie die Länge als ganze Zahl an, die Zahl muss größer als 0 sein.");
        int zahl = scanner.nextInt();
        System.out.println("Bitte geben Sie die Breite als ganze Zahl an, die Zahl muss größer als 0 sein.");
        int zahl2 = scanner.nextInt();

        int Ergebnis = zahl * zahl2;

        System.out.print(Ergebnis);
    }
}
