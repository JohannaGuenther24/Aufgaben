package com.btcag.bootcamp.Aufgaben_Teil_Drei.verkehrssimulationNeu;

public class Car {
    String richtung = ""; //In welche Himmelsrichtung die Autos jeweils schauen (n, o, s, w)
    int position = 0; //Auf welchen Feld sich die Autos jeweils befinden
    double geschwindigkeit = 0;
    double fortschritt = 0.5; //
    static boolean crash = false; //Kontrolle ob die Autos gecrasht sind
    boolean checkBremsen = false; //Kontrolle ob in den Abschnitt schon gebremst wurde
    char feldVorher = 0;
    String neueRichtung = "";

    // Reduziert die Geschwindigkeit um die Hälfte, wenn das Auto auf eine Kurve trifft, einmalig
    public double bremsen(){
        geschwindigkeit = geschwindigkeit/2;
        if (geschwindigkeit < 0.1){
            geschwindigkeit = 0.1;
        }
        return geschwindigkeit;
    }

    //Pro Iteration wird die Geschwinigkeit erhöht auf max. 1
    public double beschleunigung(){
        geschwindigkeit = geschwindigkeit + 0.2;
        if (geschwindigkeit > 1){
            geschwindigkeit = 1;
        }
        return geschwindigkeit;
    }

    //Kontrolle, ob die beiden Autos gecrasht sind
    public boolean checkCrash(double positionEins, double positionZwei){
        if (positionEins == positionZwei){
            crash = true;
            System.out.println("Verkehrsunfall!!");
        } else {
            crash = false;
        }
        return crash;
    }


    //Bewegen von den Autos
    public void move(Car car){
        String neueRichtung = neueRichtung(car);

        if (aktuellesFeld(car) == '─' || aktuellesFeld(car) == '╫' || aktuellesFeld(car) == '│'){
            beschleunigung();
        } else if (aktuellesFeld(car) == '┘' || aktuellesFeld(car) == '┌' || aktuellesFeld(car) == '┐' || aktuellesFeld(car) == '└'){
            if (aktuellesFeld(car) != feldVorher) {
                bremsen();
                feldVorher = aktuellesFeld(car);
            } else {
                beschleunigung();
            }
        }
        fortschritt = geschwindigkeit + fortschritt;
        if(fortschritt >= 1){
            fortschritt = fortschritt - 1;
            if (richtung.equals("o")){
                car.position = car.position+1;
                car.richtung = neueRichtung;
            } else if (richtung.equals("s")){
                car.position = car.position+(Spielfeld.xMax+2);
                car.richtung = neueRichtung;
            } else if (richtung.equals("w")){
                car.position = car.position-1;
                car.richtung = neueRichtung;
            } else if (richtung.equals("n")){
                car.position = car.position-(Spielfeld.xMax+2);
                car.richtung = neueRichtung;
            }
        }
    }

    public char aktuellesFeld(Car car){
        return Spielfeld.getsymbol(car.position);
    }

    public char naechstesFeld(Car car, String richtung){
        char naechstesFeld = 0;
        if (richtung.equals("o")){
            naechstesFeld = Spielfeld.getsymbol(car.position+1);
        } else if (richtung.equals("s")){
            naechstesFeld = Spielfeld.getsymbol(car.position+(Spielfeld.xMax+2));
        } else if (richtung.equals("w")){
            naechstesFeld = Spielfeld.getsymbol(car.position-1);
        } else if (richtung.equals("n")){
            naechstesFeld = Spielfeld.getsymbol(car.position-(Spielfeld.xMax+2));
        }
        return naechstesFeld;
    }

    public String neueRichtung(Car car){
        if (naechstesFeld(car, car.richtung) == '┘'){
            if(car.richtung.equals("o")){
                neueRichtung = "n";
            } else if (car.richtung.equals("s")){
                neueRichtung = "w";
            }
        } else if (naechstesFeld(car, car.richtung) == '┐'){
            if(car.richtung.equals("n")){
                neueRichtung = "w";
            } else if (car.richtung.equals("o")){
                neueRichtung = "s";
            }
        } else if (naechstesFeld(car, car.richtung) == '┌'){
            if(car.richtung.equals("w")){
                neueRichtung = "s";
            } else if (car.richtung.equals("n")){
                neueRichtung = "o";
            }
        } else if (naechstesFeld(car, car.richtung) == '└'){
            if(car.richtung.equals("s")){
                neueRichtung = "o";
            } else if (car.richtung.equals("w")){
                neueRichtung = "n";
            }
        } else if (naechstesFeld(car, car.richtung) == '┬'){
            if(car.richtung.equals("n")){
                neueRichtung = "o";
            } else if (car.richtung.equals("o")){
                neueRichtung = "o";
            } else if (car.richtung.equals("w")){
                neueRichtung = "w";
            }
        } else if (naechstesFeld(car, car.richtung) == '─'){
            if(car.richtung.equals("w")){
                neueRichtung = "w";
            } else if (car.richtung.equals("o")){
                neueRichtung = "o";
            }
        } else if (naechstesFeld(car, car.richtung) == '│') {
            if (car.richtung.equals("n")) {
                neueRichtung = "n";
            } else if (car.richtung.equals("s")) {
                neueRichtung = "s";
            }
        }
            return neueRichtung;
    }
}
