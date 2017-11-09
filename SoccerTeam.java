package Chapter4;


/**
 * Write a description of class SoccerTeam here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SoccerTeam
{
    public static void main(String[] args) {
        Team ahsSoccer = new Team("Acalanes", 23);
        Athlete joe = new Athlete("Joe", 16);
        ahsSoccer.addAthlete(0, joe);
        System.out.println(ahsSoccer);
    }
}
