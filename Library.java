package Chapter4;



public class Library
{
    // instance variables - replace the example below with your own
    private Book[] books;
    private String name;
    

    public Library(Book[] b, String nm)
    {
        // initialise instance variables
        this.books = b;
        this.name = nm;
    }

    public String toString() {
        String output = "The library " + name + " has the following:";
    }
    
    public void addBook(int location, Book b)
    {
        
    }
    
}