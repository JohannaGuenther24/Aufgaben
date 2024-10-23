package com.btcag.bootcamp.Aufgaben_Teil_Eins;

import java.util.Scanner;

public class Backward {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Zahl ein, welche Sie rueckwaerts ausgeben wollen: ");
        String zahl = scanner.nextLine();
        int l = zahl.length()-1;

        while (l >= 0) {
            System.out.print(zahl.charAt(l));
            l--;
        }

    }
}
