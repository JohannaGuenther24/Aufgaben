package com.btcag.bootcamp;

import java.util.Scanner;

public class ASCIITriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte geben Sie eine ganze Zahl ein:");
        int Eingabe = sc.nextInt();
        char stern = (char)42;
        int zahl = Eingabe;
        int Subtraktion = 1;
        int zahl2 = Eingabe - Subtraktion;

        while (zahl > 0) {
            while (zahl2 != Eingabe) {
                System.out.print(stern);
                zahl2++;
            }
            System.out.println("");
            Subtraktion++;
            zahl2 = Eingabe - Subtraktion;
            zahl--;
        }
    }
}
