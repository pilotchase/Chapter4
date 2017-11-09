package Chapter4;
public class Pet
{
    // instance variables - replace the example below with your own
    private String name;
    private String gender;

    /**
     * Constructor for objects of class Pet
     */
    public Pet()
    {
     
    }
    
    public Pet(String nm, String gnd) {
        this.name = nm;
        this.gender = gnd;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return "This pet's name is: " + this.name;
    }
    
    public boolean equals(Pet other) {
        if(this.name.equals(other.name)) {
            return true;
        }
        return false;
    }
    
    public static void example() {
        System.out.print("This is in a static method");
    }
}
