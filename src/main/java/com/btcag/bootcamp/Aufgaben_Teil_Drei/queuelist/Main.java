package com.btcag.bootcamp.Aufgaben_Teil_Drei.queuelist;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        QueueList list = new QueueList();


        System.out.println("Diese Zahl wurde am Anfang hinzugefügt: " + list.pushFront(6));
        System.out.println();
        System.out.println("Diese Zahl wurde am Ende hinzugefügt: " + list.pushLast(7));
        System.out.println();
        System.out.println("Diese Zahl wurde am Anfang entfernt: " + list.popFront());
        System.out.println();
        System.out.println("Diese Zahl wurde am Ende entfernt: " + list.popLast());
        System.out.println();
        System.out.println(list.get(2));

    }

}

