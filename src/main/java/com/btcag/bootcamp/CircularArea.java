package com.btcag.bootcamp;

import java.util.Scanner;

public class CircularArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine ganze Zahl, die größer als 0 ist, für den Radius ein: ");
        int zahl = scanner.nextInt();

        double pi = 3.14;
        double Ergebnis = (zahl * zahl) *  pi;
        System.out.println(Ergebnis);
    }
}
