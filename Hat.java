package Chapter4;

public class Hat
{
    private String color;
    private String brand;
    
    public Hat() {
        // Default constructor
    }
    
    public Hat(String clr, String brnd) {
        this.color = clr;
        this.brand = brnd;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public String toString() {
        return "This hat was made by " + this.brand;
    }
}
