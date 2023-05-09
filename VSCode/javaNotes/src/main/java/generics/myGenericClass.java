package generics;

public class myGenericClass <Thing extends Number, Thing2 extends Number>{

	Thing x;
	Thing2 y;
	
	myGenericClass(Thing x, Thing2 y){
		this.x = x;
		this.y = y;
	}
	
	public Thing2 getValue() {
		return y;
		
	}
}
