package com.btcag.bootcamp;

import java.util.Scanner;

public class DivCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcher Divisor soll geprueft werden?");
        int Divisor = sc.nextInt();
        System.out.println("Bis zu welcher Zahl?");
        int zahl = sc.nextInt();

        int multiplikator = zahl / Divisor;
        int zaehler = 0;

        while (zaehler <= multiplikator) {
            int result = Divisor * zaehler;
            System.out.println(result);
            zaehler++;
        }
    }
}
