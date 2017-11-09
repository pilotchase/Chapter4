package Chapter4;

public class Student
{
    private int idNumber;
    private String name;
    private Student bestFriend;
    private Pet pete;
    private Hat h;
    
    /**
     * Constructor for objects of class Student
     */
    public Student()
    {
        // initialise instance variables
        
    }
    
    public Student(int num, String nm) {
        this.idNumber = num;
        this.name = nm;
    }
    
    public String getName() {
        return this.name;
    }
    
    public Student makeStudent() {
        Student joe = new Student(this.idNumber, bestFriend.name);
        return joe;
    }
    
    public String toString() {
        return "The student name is: " + this.name;
    }
}
