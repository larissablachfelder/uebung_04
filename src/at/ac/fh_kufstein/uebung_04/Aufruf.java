package at.ac.fh_kufstein.uebung_04;

import at.ac.fh_kufstein.uebung_04.at.ac.fh_kufstein.uebung_04.Classes.Car;

public class Aufruf
{
    public static void main(String[] args)
    {
        //Car (Farbe rot, Reifen 4, Geschwindigkeit 200.0)
        Car auto = new Car("rot",4, 200.0);
        System.out.print("Die Geschwindigkeit beträgt: "); //text wird ausgegeben
        auto.currentSpeed();//geschwindigkeit wird mit  der methode ausgegeben
    }

}
