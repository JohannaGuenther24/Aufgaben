package com.btcag.bootcamp;

import java.util.Scanner;

public class ASCIIHourglass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte geben Sie eine ganze Zahl ein:");
        int Eingabe = sc.nextInt();
        char stern = (char)42;
        int zaehler = Eingabe;
        int zaehler2 = Eingabe;
        int Subtraktion = 1;
        int Addition = 1;
        int zahlS = Eingabe - Subtraktion;
        int zahlA = 1;
        int wert = 0;


    //Oben
        while (zaehler > 0) {
            while (zahlA <= Eingabe - wert) {
                System.out.print(stern);
                zahlA++;
            }
            wert++;
            zahlA = 1;
            System.out.println("");
            zaehler--;
        }

        System.out.println("");

     //Unten
        while (zaehler2 > 0) {
            while (zahlS != Eingabe) {
                System.out.print(stern);
                zahlS++;
            }
            System.out.println("");
            Subtraktion++;
            zahlS = Eingabe - Subtraktion;
            zaehler2--;
        }
    }
}
