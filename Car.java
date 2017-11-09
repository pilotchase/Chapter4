package Chapter4;


/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car
{
    String color;
    String brand;
    
    public Car(String clr, String brnd)
    {
        this.color = clr;
        this.brand = brnd;
    }
    
    public String getColor()
    {
        return this.color;
    }
    
    public String toString()
    {
        return "The color of the car is: " + color;
    }
}
