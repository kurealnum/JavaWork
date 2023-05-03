package basics;

import java.util.Scanner;

public class switchesLoopsandConditionals {
    public static void main(String[] args){
        /* switches are helpful when you ned to test a variable for equality
        against a list of values*/
        String day = "Friday";

        switch(day) {
            //literally just if statements simplified
            case "Sunday": System.out.println("It is Sunday!");
            break;
            case "Friday": System.out.println("It is Friday!");
            break;
            //default is the "else" statement
            default: System.out.println("That isn't a day!");
        }

        /*for loops are really just like c loops, so I'm not doing an example.
        same thing for nested  loops and while loops.
        do while loops are a little bit more useful and different though:*/
        

        Scanner scanner = new Scanner(System.in);
        String name = "";
        do{
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        }while(name.isBlank());

        System.out.println("Hello "+name);
        scanner.close();
    }
}
