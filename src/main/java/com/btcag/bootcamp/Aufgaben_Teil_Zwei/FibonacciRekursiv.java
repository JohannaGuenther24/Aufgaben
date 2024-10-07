package com.btcag.bootcamp.Aufgaben_Teil_Zwei;

import java.util.Scanner;

public class FibonacciRekursiv {
    public static void main(String[] args) {

        System.out.println("Bitte geben Sie eine Zahl ein: ");
        Scanner sc = new Scanner(System.in);
        int zahl = sc.nextInt();

        for (int i = 0; fibonacci(i) < zahl; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
    public static int fibonacci(int n) {
        if (n <= 1){
            return n;
        }
        else {
            return fibonacci(n - 2) + fibonacci(n - 1);
        }
    }
}
