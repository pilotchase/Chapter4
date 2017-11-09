package Chapter4;


/**
 * Write a description of class Athlete here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Athlete
{
    private String name;
    private int age;
    
    public Athlete(String nm, int ag)
    {
       this.name = nm;
       this.age = ag;
    }
    
    public String toString()
    {
        return "The athlete's name is " + this.name + " and they are " + this.age + " years old.\n";
    }
}
