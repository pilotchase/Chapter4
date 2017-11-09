package Chapter4;

public class PetDriver
{
    public static void main() {
        Pet koda = new Pet("Koda", "Male");
        Pet kate = new Pet("Kate", "Female");
        System.out.println(koda.getName());
        System.out.println(koda.equals(kate));
        
        Pet.example();
    }
}
