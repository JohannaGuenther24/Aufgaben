package com.btcag.bootcamp.Aufgaben_Teil_Eins;

import java.util.Scanner;

public class Crosssum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie eine Zahl zur Quersummenberechnung ein:");
        long zahl = scanner.nextLong();
        long result = 0;

        while (0 != zahl) {
            result = result + (zahl % 10);
            zahl = zahl / 10;
        }
        System.out.println(result);
    }
}
