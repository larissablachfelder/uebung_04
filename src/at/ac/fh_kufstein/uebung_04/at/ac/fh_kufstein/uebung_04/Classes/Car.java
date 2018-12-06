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

    //Konstruktor erstellt der direkt die Variablen aufnimmt
    public Car (String color, int wheels, double speed)
    {
        this.color = color;
        this.wheels = wheels;
        this.speed = speed;
    }
}
