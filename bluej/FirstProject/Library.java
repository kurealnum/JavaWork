import java.util.ArrayList;

public class Library
{
    //private variables, accessed through methods
    private String libraryName;
    private ArrayList<String> books = new ArrayList<String>();
    
    public Library(String newLibraryName)
    {
        libraryName = newLibraryName;
    }
    
    public ArrayList<String> returnLibrary()
    {
        return books;
    }
    
    public void addBook(String bookName)
    {
        books.add(bookName);
        System.out.println("Added " + bookName);
    }
    
    public void removeBook(String bookName)
    {
        //basically just making sure the user didn't mess up the name
        try
        {
            books.remove(books.indexOf(bookName));   
            System.out.println("Removed " + bookName);
        }
        catch(Exception e)
        {
            System.out.println("This book isn't in this library!");
        }
        
    }
    
    public String returnName()
    {
        return libraryName;
    }
}
