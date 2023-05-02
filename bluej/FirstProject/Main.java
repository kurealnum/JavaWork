import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //base variables, like the library name, and the typo/error message
        Library l = new Library("KG Library");
        String typoMsg = "There was a typo in your input. Please try again";
        String lName = l.returnName();
        
        //keep prompting the user
        while (true)
        {
            Scanner inputType = new Scanner(System.in);
            System.out.println("Would you like to interact with the library," 
                + "find out the library name, see all of the books in the"
                + "library, or leave the library?\n(interact, name, books, leave)");
                
            String input = inputType.nextLine().strip();
            //if input = name, books, leave or interact
            if (input.equals("name"))
            {
                System.out.println(lName);  
            }
            
            else if (input.equals("books"))
            {
                System.out.println(l.returnLibrary());
            }
            
            else if (input.equals("leave"))
            {
                break;
            }
            
            else if (input.equals("interact"))
            {     
                //add or remove a book, calling methods from the Library class
                Scanner choice = new Scanner(System.in);
                System.out.println("Would you like to add or remove a book from " + lName + "? ");
                
                String addOrRemove = choice.nextLine().strip();
                
                if (addOrRemove.equals("add"))
                {
                    //add a book chosen by the user
                    Scanner book = new Scanner(System.in);
                    System.out.println("Enter the book to add: ");
                    
                    String bookName = book.nextLine();
                    l.addBook(bookName);
                }
                
                else if (addOrRemove.equals("remove"))
                {
                    //remove a book chosen by the user
                    Scanner book = new Scanner(System.in);
                    System.out.println("Enter the book to remove: ");
                    
                    String bookName = book.nextLine();
                    l.removeBook(bookName);
                
                }
                
                else
                {
                    //typo message
                    System.out.println(typoMsg);
                }
            } 
            
            else
            {
                //typo msg again
                System.out.println(typoMsg);
                continue;
            }
        }   
    }
}
