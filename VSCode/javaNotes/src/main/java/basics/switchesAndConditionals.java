package basics;

public class switchesAndConditionals {
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

    }
}
