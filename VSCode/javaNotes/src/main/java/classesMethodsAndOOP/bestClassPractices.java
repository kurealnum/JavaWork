package classesMethodsAndOOP;

//IF YOU WANT TO PASS IN OBJECTS, MAKE SURE THE PARAMETER IS THE TYPE OF OBJECT YOU'RE PASSING IN
// static = modifier. A single copy of a variable/method is created and shared.
//			The class "owns" the static member

//You can use the "extends" keyword on classes for inheritance like:
// public class myClass extends awesomeClass {

// method overriding = 	Declaring a method in sub class,
//						which is already present in parent class.
//						done so that a child class can give its own implementation
//						i.e., each class uses the closest method available \

// super = 	keyword refers to the superclass (parent) of an object
//			very similar to the "this" keyword
//			i.e., passes it up to the parent class constructor

// abstract =  	abstract classes cannot be instantiated, but they can have a subclass
//				abstract methods are declared without an implementation


public class bestClassPractices {


	String name;
	int age;
	double weight;
	
	bestClassPractices(String name,int age,double weight){
		
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	void eat() {
		System.out.println(this.name+" is eating");
	}
	void drink() {
		System.out.println(this.name+" is drinking *burp*");
	}
		
}
