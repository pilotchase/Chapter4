package Chapter4;


/**
 * Write a description of class Team here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Team
{
    private String name;
    private Athlete players[];
    
    public Team(String nm, int size)
    {
        this.name = nm;
        players = new Athlete[size];
    }
    
    public String toString()
    {
        String output = "The memebrs of this team are: \n";
        for(Athlete a: players) {
            output += a + "\n";
        }
        return output;
    }
    
    public void addAthlete(int index, Athlete a)
    {
        players[index] = a;
    }
}
