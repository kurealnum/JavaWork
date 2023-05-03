package basics;

//imports
import java.util.Random;

public class mathOperatorsAndNums {
    /* expression = operands and operators
     * operands = values, vars, numbers, quanity
     * operators = + - * / %
     * 
     * logical operators:
     * && = (AND) both conditions must be true
     * || = (OR) one condition must be true
     * ! = (NOT) reverses boolean value of a condition
    */

    public static void main (String [] args){
        // if you want to do integer division, you can cast the output type like so
        double computers = 10;
        computers = (double) computers/3; //will result in 3.3333...

        //the math class in action (amazing pun as well!)
        double laptops = 3;

        /* this is the maximum function. there are a lot though, like:
        abs, min, round, ect.*/
        double x = Math.max(computers, laptops);

        //here's how we can generate sudo random numbers
        Random random = new Random();

        //this generates a random number! You can also do stuff for ints, floats, ect.
        x = random.nextDouble();

        //if you want to generate a random number between parameters, do it like so:
        int y = random.nextInt(6);
        
        //if you want the number to be between 1 and 6, and not 0 and 5, just increment it
        y++;
    }
}
