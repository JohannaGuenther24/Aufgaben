package com.btcag.bootcamp;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie eine ganze Zahl ein: ");
        int n = sc.nextInt();
        int result = 0;
        int result2 = 1;
        int result3 = 0;

        while (result <= n) {
            System.out.println(result);
            result3 = result + result2;
            result2 = result;
            result = result3;

        }

    }
}
