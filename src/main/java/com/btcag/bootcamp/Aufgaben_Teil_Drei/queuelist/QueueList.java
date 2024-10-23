package com.btcag.bootcamp.Aufgaben_Teil_Drei.queuelist;

public class QueueList implements Array {
    private int groesse = 4;
    private int[] kopie = new int[groesse];
    private int[] liste = new int[]{1, 5, 3, 5};
    private int rueckgabe;

    public void arrayFaktor() {
        for (int i = 0; i < groesse; i++) {
            kopie[i] = liste[i];
        }
        liste = new int[groesse * 2];
        for (int i = 0; i < groesse; i++) {
            liste[i] = kopie[i];
        }
        groesse = groesse * 2;
        kopie = new int[groesse];
    }

    @Override
    public int popFront() { //gibt das erste Objekt zurück und löscht diesem von den Daten
        ausgabe();
        rueckgabe = liste[0];

        for (int j = 0; j < groesse - 1; j++) {
            kopie[j] = liste[j + 1];
        }
        for (int i = 0; i < groesse; i++) {
            liste[i] = kopie[i];
        }
        ausgabe();
        return rueckgabe;
    }

    @Override
    public int popLast() { // gibt das letzte Objekt zurück und entfernt diese von den Daten
        ausgabe();
        int counter = 0;
        for (int i = 0; i < groesse; i++) {
            if (liste[i] != 0) {
                counter++;
            }
        }
        rueckgabe = liste[counter - 1];
        liste[counter - 1] = 0;
        ausgabe();
        return rueckgabe;
    }

    @Override
    public int pushLast(int i) { //fügt dieses Objekt den Daten am Ende hinzu
        ausgabe();
        int counter = 0;
        for (int j = 0; j < groesse; j++) {
            if (liste[j] != 0) {
                counter++;
            }
        }
        if (counter == groesse) {
            arrayFaktor();
        }
        for (int j = 0; j < counter + 1; j++) {
            if (liste[j] == 0) {
                liste[j] = i;
            }
        }
        ausgabe();
        return i;
    }

    @Override
    public int pushFront(int i) { //fügt dieses Objekt den Daten am Anfang hinzu
        ausgabe();
        int counter = 0;
        for (int j = 0; j < groesse; j++) {
            if (liste[j] != 0) {
                counter++;
            }
        }
        if (counter == groesse) {
            arrayFaktor();
        }
        for (int j = 0; j < groesse; j++) {
            kopie[j] = liste[j];
        }
        for (int j = 0; j < groesse - 1; j++) {
            liste[j + 1] = kopie[j];
        }
        liste[0] = i;
        ausgabe();
        return i;
    }

    @Override
    public int get(int i) { //gibt an Stelle i das Objekt zurück, entfernt es aber nicht
        return liste[i];
    }

    public void ausgabe() {
        for (int i = 0; i < groesse; i++) {
            if (liste[i] != 0) {
                System.out.print(liste[i] + " ");
            }
        }
        System.out.println();
    }

}
