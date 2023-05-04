package basics;

public class overloadedConstructors {

    //example with pizza, if that wasn't clear enough

	String bread;
	String sauce;
	String cheese;
	String topping;
	
	overloadedConstructors(){
		
	}
	
	overloadedConstructors(String bread){
		
		this.bread = bread;
	}
	
	overloadedConstructors(String bread,String sauce){
		
		this.bread = bread;
		this.sauce = sauce;
	}
	
	overloadedConstructors(String bread,String sauce,String cheese){
		
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
	}
	
	overloadedConstructors(String bread,String sauce,String cheese,String topping){
		
		this.bread = bread;
		this.sauce = sauce;
		this.cheese = cheese;
		this.topping = topping;
	}
}
