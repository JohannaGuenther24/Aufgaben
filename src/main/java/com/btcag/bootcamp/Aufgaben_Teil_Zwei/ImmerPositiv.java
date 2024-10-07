package com.btcag.bootcamp.Aufgaben_Teil_Zwei;

import java.util.Scanner;

public class ImmerPositiv {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie eine Zahl ein: ");
        int number = sc.nextInt();

        if(number < 0) {
            number = number * -1;
            System.out.println("Deine positive Zahl lautet: " + number);
        }
        else {
            System.out.println("Deine positive Zahl lautet: " + number);
        }
    }
}
