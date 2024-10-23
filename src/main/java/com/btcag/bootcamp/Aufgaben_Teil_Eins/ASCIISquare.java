package com.btcag.bootcamp.Aufgaben_Teil_Eins;

import java.util.Scanner;

public class ASCIISquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte geben Sie eine ganze Zahl ein:");
        int Eingabe = sc.nextInt();
        char stern = (char)42;
        int zahl = Eingabe;
        int zahl2 = Eingabe;

        while (zahl > 0) {
            while (zahl2 > 0) {
                System.out.print(stern);
                zahl2--;
            }
            zahl2 = Eingabe;
            zahl--;
            System.out.println("");
        }


    }
}
