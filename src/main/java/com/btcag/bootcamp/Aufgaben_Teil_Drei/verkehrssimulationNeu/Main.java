package com.btcag.bootcamp.Aufgaben_Teil_Drei.verkehrssimulationNeu;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int zaehler=0;

        Car car1 = new Car();
        Car car2 = new Car();
        Spielfeld sf = new Spielfeld();

        sf.berechneSpielfeld();

        car1.position= Spielfeld.start;
        car1.richtung = "o"; //Auto Eins fährt zuerst nach rechts
        car2.position= Spielfeld.start;
        car2.richtung = "w"; //Auto Zwei fährt zuerst nach links



        // Durchlauf bis es zum Crash kommt
        while(!Car.crash){
            car1.move(car1);
            if (zaehler > 3) { //Verhindert dass direkt ein Crash ausgegebn wird, da beide Autos auf der Selben Position starten
                car1.checkCrash(car1.position, car2.position);
            }
            car2.move(car2);
            if (zaehler > 3) { //Verhindert dass direkt ein Crash ausgegebn wird, da beide Autos auf der Selben Position starten
                car1.checkCrash(car1.position, car2.position);
            }
            zaehler++;
        }
        System.out.println("Auf Position: " + car1.position);

    }
}
