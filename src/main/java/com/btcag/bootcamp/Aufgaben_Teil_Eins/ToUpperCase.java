package com.btcag.bootcamp.Aufgaben_Teil_Eins;

import java.util.Scanner;

public class ToUpperCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte String eingeben:");
        String text = sc.nextLine();

        int i = 0;
        String ergebnis = "";


        while (i < text.length()) {
            int low = text.charAt(i);
            char up = (char)(low-32);
            ergebnis = ergebnis + up;
            i++;
        }
        System.out.print(ergebnis);
    }
}
