package com.btcag.bootcamp.Aufgaben_Teil_Zwei;

import java.util.Arrays;

public class Sortieren {
    public static void main(String[] args) {

    int[] unsortiert = {5,13,6,8,11};

    int[] sortiert = sortieren(unsortiert);
    System.out.println(Arrays.toString(sortiert));


    }
    public static int[] sortieren(int[] zahlen) {
        for (int i = 0; i < zahlen.length-1; i++) {
            if (zahlen[i] > zahlen[i + 1]) {
                int tmp = 0;
                tmp = zahlen[i];
                zahlen[i] = zahlen[i + 1];
                zahlen[i + 1] = tmp;
            }
        }
        return zahlen;
    }
}
