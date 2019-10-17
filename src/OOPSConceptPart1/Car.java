package OOPSConceptPart1;

public class Car {

	
	//class vars: Global variables
	int mod;
	int wheel;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Car a = new Car(); //new Car() - Object of car class //a -is representing object
		//new keyword used for creating object
		//a,b,c - object reference variable
		Car b = new Car();
		Car c = new Car();
	
		
		System.out.println("before assigning references");
		System.out.println(a.mod);
		System.out.println(b.mod);
		System.out.println(c.mod);
		
		a.wheel=4;
		b.wheel=5;
		c.wheel=6;
		System.out.println();
		System.out.println(c.wheel);
		
		System.out.println("After assigning references");
		
		a=b;
		b=c;
		c=a;
		//shifting object reference to another object reference
		
		a.mod=10;
		c.mod=30;
		
		// a value replacing with c value
		System.out.println(a.mod);
		System.out.println(c.mod);
		
		
		
	}

}
