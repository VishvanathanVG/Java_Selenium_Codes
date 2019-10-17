package OOPSConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Static polymorphism - when child class object and reference variable - compile time polymorphism
		Maruthi mar=new Maruthi();
		mar.start();
		mar.theftsafety();
		mar.stop();
		//System.out.println(mar.start());
		
		System.out.println("**************");
		
		Car c=new Car();
		c.start();
		c.stop();
		
		//TOP Casting
		Car c1=new Maruthi();//Dynamic polymorphism run time polymorphism
		//child class object can be referred by parent class reference variable 
		c1.start();
		c1.stop();
		c1.refuel();
	
		
		
		//Down casting - while run time it will throw class cast exception
		
		Maruthi ma = (Maruthi)new Car();
	}

}
