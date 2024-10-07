package com.btcag.bootcamp.Aufgaben_Teil_Zwei;

import java.util.Scanner;

public class Schaltjahre {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Jahreszahl ein: ");
        int jahreszahl = sc.nextInt();

        if (jahreszahl % 4 == 0 && jahreszahl % 100 == 0 && jahreszahl % 400 > 0) {
            System.out.println(jahreszahl +" ist kein Schaltjahr.");
        }
        else if (jahreszahl % 4 == 0) {
            System.out.println(jahreszahl +" ist ein Schaltjahr.");
        }
        else {
            System.out.println(jahreszahl +" ist kein Schaltjahr.");
        }
    }
}
