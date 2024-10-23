package com.btcag.bootcamp.Aufgaben_Teil_Eins;

import java.util.Scanner;

public class Subnetting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int zaehler = 1;
        int zaehler2 = 1;
        int bit = 128;
        String oktettNeu = "";
        int i = 0;
        int result = 0;
        int rechnung = 0;
        int broadcast = 0;
        String oktettNeuB = "";


        System.out.println("Bitte gebe das erste Oktett der ip adresse ein:");
        int oktett1 = sc.nextInt();

        System.out.println("Bitte gebe das zweite Oktett der ip adresse ein:");
        int oktett2 = sc.nextInt();

        System.out.println("Bitte gebe das dritte Oktett der ip adresse ein:");
        int oktett3 = sc.nextInt();

        System.out.println("Bitte gebe das vierte Oktett der ip adresse ein:");
        int oktett4 = sc.nextInt();

        System.out.println("Bitte gebe die Subnetzmaske an.");
        int subnet = sc.nextInt();
        int wert = 0;


        while (subnet > 24){
            wert = 32 - subnet;
            wert = 8-wert;
            while (zaehler <= wert){
                oktettNeu = oktettNeu + (oktett4 / bit);
                oktett4 = oktett4 % bit;
                bit = bit / 2;
                zaehler++;
            }
            break;
        }

        while (subnet > 16 && subnet <= 24){
            wert = 24 - subnet;
            wert = 8-wert;
            while (zaehler <= wert){
                oktettNeu = oktettNeu + (oktett3 / bit);
                oktett3 = oktett3 % bit;
                bit = bit / 2;
                zaehler++;
            }
            oktett4 = 0;
            break;
        }

        while (subnet > 8 && subnet <= 16){
            wert = 16 - subnet;
            wert = 8-wert;
            while (zaehler <= wert){
                oktettNeu = oktettNeu + (oktett2 / bit);
                oktett2 = oktett2 % bit;
                bit = bit / 2;
                zaehler++;
            }
            oktett3 = 0;
            oktett4 = 0;
            break;
        }

        while (subnet > 0 && subnet <= 8){
            wert = 8 - subnet;
            wert = 8-wert;
            while (zaehler <= wert){
                oktettNeu = oktettNeu + (oktett1 / bit);
                oktett1 = oktett1 % bit;
                bit = bit / 2;
                zaehler++;
            }
            oktett2 = 0;
            oktett3 = 0;
            oktett4 = 0;
            break;
        }
        zaehler = 1;
        bit = 128;
        zaehler2 = 8-wert;

        while(zaehler2 <= 8){
            oktettNeuB = oktettNeu + 1;
            zaehler2++;
        }
        zaehler2 = 0;

        while (zaehler2 <= 8){
            rechnung = Integer.parseInt(String.valueOf(oktettNeuB.charAt(i))) * bit;

            broadcast = broadcast + rechnung;

            bit = bit / 2;
            zaehler2++;
            i++;
        }

        i=0;
        rechnung = 0;

        while (zaehler <= wert){
            rechnung = Integer.parseInt(String.valueOf(oktettNeu.charAt(i))) * bit;

            result = result + rechnung;

            bit = bit / 2;
            zaehler++;
            i++;
        }

        if (subnet > 24) {
            System.out.println(oktett1 + "." + oktett2 + "." + oktett3 + "." + result);
            System.out.println(oktett1 + "." + oktett2 + "." + oktett3 + "." + broadcast);
        }
        else if (subnet > 16 && subnet <= 24) {
            System.out.println(oktett1 + "." + oktett2 + "." + result + "." + oktett4);
            System.out.println(oktett1 + "." + oktett2 + "." + broadcast + "." + oktett4);

        }
        else if (subnet > 8 && subnet <= 16) {
            System.out.println(oktett1 + "." + result + "." + oktett3 + "." + oktett4);
            System.out.println(oktett1 + "." + broadcast + "." + oktett3 + "." + oktett4);
        }
        else {
            System.out.println(result + "." + oktett2 + "." + oktett3 + "." + oktett4);
            System.out.println(broadcast + "." + oktett2 + "." + oktett3 + "." + oktett4);
        }
    }
}
