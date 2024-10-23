package com.btcag.bootcamp.Aufgaben_Teil_Drei.verkehrssimulationNeu;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Spielfeld {
    int counterX = 0;
    static int yMax = 0;
    static int xMax = 0;
    int zaehler = 0;
    static String symbol = "";
    static int start =0;


    //Datei wird eingelesen
    static Path path = Paths.get("C:\\Users\\JOGUENTH\\IdeaProjects\\Testen\\src\\main\\resources\\Topologie");
    static String string;

    static {
        try {
            string = Files.readString(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    int laenge = string.length();


    public Spielfeld() throws IOException {

    }

    //Die X und Y Werte werden errechnet und die Position wo der Start sich befindet
    public void berechneSpielfeld() {
        for (int i = 0; i < laenge; i++) {
            if (string.charAt(i) == '\n' || string.charAt(i) == '\r') {
                counterX++;
                if (counterX == 2) {
                    yMax++;
                    counterX = 0;
                    if (zaehler > xMax) {
                        xMax = zaehler;
                    }
                    zaehler = 0;
                }
            } else {
                zaehler++;
            }
        }
        yMax++;


        for (int i = 0; i < laenge; i++) {
            if (string.charAt(i) == '╫') {
                start = i;
            }
        }
    }
    //   0   1   2     3    4   5   (6   7)
    //   8   9  10    11   12  13   (14 15)
    //  16  17  18  [19]   20

    public static char getsymbol(int i){
        char symbol = string.charAt(i);
        return symbol;
    }
}
