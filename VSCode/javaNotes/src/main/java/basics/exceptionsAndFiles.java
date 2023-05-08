package basics;

import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionsAndFiles {
    public static void main(String[] args) {
		
		// exception = 	an event that occurs during the execution of a program that,
		//				disrupts the normal flow of instructions

		// user defined excpetions = custom exceptions

		Scanner scan = new Scanner(System.in);
			 System.out.print("Enter your age: ");
			 int age = scan.nextInt();
	 	 
		      try{  
		    	  checkAge(age);  
		      }
		      catch(Exception e)
		      {
		    	  System.out.println("A problem occured: "+e);
		      }   

			  scan.close();
		}  
		 
		static void checkAge(int age)throws AgeException{ 
			 
			     if(age<18) {
			    	 throw new AgeException("\n"+"You must be 18+ to sign up");  
			     }
			     else {
			    	 System.out.println("You are now signed up!"); 
			     }    
			
		//general exceptions
		
		Scanner scanner = new Scanner(System.in);
		
		try {
		
			System.out.println("Enter a whole number to divide: ");
			int x = scanner.nextInt();
		
			System.out.println("Enter a whole number to divide by: ");
			int y = scanner.nextInt();
		
			int z = x/y;
		
			System.out.println("result: " + z);
		}
		catch(ArithmeticException e) {
			System.out.println("You can't divide by zero! IDIOT!");
		}
		catch(InputMismatchException e) {
			System.out.println("PLEASE ENTER A NUMBER OMFG!!!");
		}
		catch(Exception e) {
			System.out.println("Something went wrong");
		}
		finally {
			scanner.close();
		}

		// file = An abstract representation of file and directory pathnames

		// FileReader = read the contents of a file as a stream of characters. One by one
		//				read() returns an int value which contains the byte value
		//				when read() returns -1, there is no more data to be read
  
		 File file = new File("secret_message.txt");
  
		 if(file.exists()) {
		  System.out.println("That file exists! :O!");
		  System.out.println(file.getPath());
		  System.out.println(file.getAbsolutePath());
		  System.out.println(file.isFile());
		  file.delete();
		 }
		 else {
		  System.out.println("That file doesn't exist :(");
		 }  
			
	}
    
}
