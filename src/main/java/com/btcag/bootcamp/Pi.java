package com.btcag.bootcamp;

import java.util.Scanner;

public class Pi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Anzahl der Iterationen eingeben:");
        int iteration = sc.nextInt();
        int zaehler = 2;

        double divident = 1;
        double divisor = 3;
        double result = 1;
        int vorzeichen = 0;

        while (iteration == 1) {
            iteration = 0;
        }
        while (zaehler <= iteration) {
            while (vorzeichen == 1) {
                result = result + (divident / divisor);
                divisor = divisor + 2;
                zaehler++;
                vorzeichen--;
            }
            result = result - (divident / divisor);
            divisor = divisor + 2;
            zaehler++;
            vorzeichen++;

        }

        result = result * 4;
        System.out.println("Pi: " + result);



    }
}
