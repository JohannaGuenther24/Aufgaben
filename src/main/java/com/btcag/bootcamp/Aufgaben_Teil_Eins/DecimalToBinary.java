package com.btcag.bootcamp.Aufgaben_Teil_Eins;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gebe eine positive Ganze Zahl ein:");
        int decimal = scanner.nextInt();
        String result = "";

        while (decimal > 0) {
            int resultModulo = decimal % 2;
            result = resultModulo + result;

            decimal = decimal / 2;

        }
        System.out.print("Das Ergebnis lautet:" + result);
    }
}
