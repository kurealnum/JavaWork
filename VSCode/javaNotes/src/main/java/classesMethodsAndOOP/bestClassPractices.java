package classesMethodsAndOOP;

// IF YOU WANT TO PASS IN OBJECTS, MAKE SURE THE PARAMETER IS THE TYPE OF OBJECT YOU'RE PASSING IN
// static = modifier. A single copy of a variable/method is created and shared.
//			The class "owns" the static member

// You can use the "extends" keyword on classes for inheritance like:
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

// public: visible in all classes in all packages
// protected: visible to all classes in the same package or classes in other packages that are a subclass
// default: visible to all classes in the same package 
// private: visible only in the same class

// interface =  a template that can be applied to a class
//				similar to inheritance, buit specifies what a class has/must do.
//				classes can apply more than one interface, inheritance is limited to 1 super

// dynamic polymorphism =  declare an object and make space for it in memory even if you dont know what type of object you want yet
// 						   ex: Car car; instead of Car car = new Car(); 

// It's good practice to add @Override to any overridden functions

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
