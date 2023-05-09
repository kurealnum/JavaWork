package classesMethodsAndOOP;

public class allKindsOfMethods {
    public static void main(String[] args) {

		/* lambda expression = 	feature for Java 8 and above
		* 						also known as an anonymous method
		* 						a shorter way to write anonymous classes with only one method
		*
		*						need to use a functional interface or use a pre-defined functional interface
		*						they contain only one abstract method
		*						ex. ActionListener, Runnable, (user-defined)
		*
		*						A Lambda expression can be used in any place where a functional interface is required
		*						How to use a lambda expression:
		*						(arguments) -> {statement/s}
		*/

		// toString() = special method that all objects inherit, 
		//    that returns a string that "textually represents" an object.
		//    can be used both implicitly and explicitly
		
		Car car = new Car();
		
		
		System.out.println(car.toString());
		
		// or
		
		System.out.println(car);
  
        // method = a block of code that is executed whenever it is called upon
        //you can't change a variable that has "final" in front of it
        final int x = 3;
        int y = 4;
        
        int z = add(x,y);
      
        System.out.println(z);

        // overloaded methods = methods that share the same name but have different parameters
		//						method name + parameters = method signature

		// method chaining =  a common syntax for invoking multiple method calls in OOP
		//      condense code into less lines
		
		String name = "      bro";
		
		//name = name.concat(" code   ");
		//name = name.toUpperCase();
		//name = name.trim();
		
		name = name.concat("code").toUpperCase().trim();
		
		//this will call overloaded method #6
		double x2 = add(1.0,2.0,3.0,4.0);
		
		System.out.println(x2);

		// printf() = 	an optional method to control, format, and display text to the console window
		//				two arguments = format string + (object/variable/value)
		//				% [flags] [precision] [width] [conversion-character]
				
		boolean myBoolean = true;
		char myChar = '@';
		String myString = "Bro";
		int myInt = 50;
		double myDouble = 1000;
			
		// [conversion-character]
		//printf is VERY similar to C's printf
		System.out.printf("%b",myBoolean);
		System.out.printf("%c",myChar);
		System.out.printf("%s",myString);
		System.out.printf("%d",myInt);
		System.out.printf("%f",myDouble);
		
		//[width]
		// minimum number of characters to be written as output
		System.out.printf("Hello %10s",myString);
		
		//[precision]
		// sets number of digits of precision when outputting floating-point values
		System.out.printf("You have this much money %.1f",myDouble);
		
		// [flags]
		// adds an effect to output based on the flag added to format specifier
		// - : left-justify
		// + : output a plus ( + ) or minus ( - ) sign for a numeric value
		// 0 : numeric values are zero-padded
		// , : comma grouping separator if numbers > 1000
		
		System.out.printf("You have this much money %,f",myDouble);

		
       }
       
    //this "int" is what the return value of the function is. more on "static" later! 	
	static int add(int a, int b) {
		System.out.println("This is overloaded method #1");
		return a + b;
	}
	static int add(int a, int b, int c) {
		System.out.println("This is overloaded method #2");
		return a + b + c;
	}
	static int add(int a, int b, int c, int d) {
		System.out.println("This is overloaded method #3");
		return a + b + c + d;
	}
	static double add(double a, double b) {
		System.out.println("This is overloaded method #4");
		return a + b;
	}
	static double add(double a, double b, double c) {
		System.out.println("This is overloaded method #5");
		return a + b + c;
	}
	static double add(double a, double b, double c, double d) {
		System.out.println("This is overloaded method #6");
		return a + b + c + d;
	}	
}
