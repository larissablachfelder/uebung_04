package at.ac.fh_kufstein.uebung_04.at.ac.fh_kufstein.uebung_04.Classes;

public class Car
{

    private String color;
    private int wheels;
    private double speed;

    public void currentSpeed()
    {
        System.out.println(speed);
    }

    //aufgabe  2
    //Konstruktor erstellt der direkt die Variablen aufnimmt
    public Car (String color, int wheels, double speed)
    {
        this.color = color;
        this.wheels = wheels;
        this.speed = speed;
    }

    //aufgabe 3 --> methoden erweitern
    public String getColor()
    {
        return color;
    }

    public int getWheels()
    {
        return wheels;
    }

    public double getSpeed()
    {
        return speed;
    }

    //erhöht die Geschwindigkeit um den übergebenen wert
    public double accelerate(double geschwindigkeit)
    {
        return this.speed += geschwindigkeit;
    }
    //verringert die Geschwindigkeit um den übergebenen wert

    public double slowdown(double geschwindigkeit)
    {
        return this.speed -= geschwindigkeit;
    }
}
