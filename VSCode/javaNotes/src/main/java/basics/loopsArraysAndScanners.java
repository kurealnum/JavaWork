package basics;

import java.util.ArrayList;
import java.util.Scanner;

public class loopsArraysAndScanners {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        /*using the nextInt function doesn't really clear the scanner, so if we 
        need to use it again, use the .nextLine() function on it, like so
        FYI functions like .nextDouble also exists*/
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("You are "+age);

        //tends to be good practice to close the scanner. Not really sure why
        scanner.close();
        
        /*you can't change the size of an array once it's instantiated
        Modifier DataType Name               Data                  */
        //String[] tools = {"Bucket", "Brush", "Ladder"};
        /*You can make a dynamic array with ArrayLists like this:

                                                    instantiates a new
        Data type that said object holds | arraylist object that holds strings*/
        ArrayList<String> paintColors = new ArrayList<String>();

        
        //also, you can of course iterate through both kinds of arrays, and do 2d arrays with both
         /*for loops are really just like c loops, so I'm not doing an example.
        same thing for nested  loops and while loops.
        do while loops are a little bit more useful and different though:*/
        
        String name = "";
        do{
            System.out.println("Enter your name: ");
            //uses scanners ^^
            name = scanner.nextLine();
        }while(name.isBlank());

        System.out.println("Hello "+name);
        scanner.close();

        /*for-each loops: traversing technique to iterate through the elements in an array
         * there are less steps, and it's more readable, but it's also less flexible
        */

        for(String i: paintColors) {
            System.out.println(i);
        }
    }
    
}
