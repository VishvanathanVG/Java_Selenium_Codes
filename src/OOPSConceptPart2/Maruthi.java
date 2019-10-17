package OOPSConceptPart2;

public class Maruthi extends Car{

	//when same method name is present in parent class and child class with same name and same arguments - Method overridden
	public void start() {
		
		System.out.println("maruthi --- start");
	}
	
	public void theftsafety() {
		System.out.println("maruthi -- theftsafety");
	}
}
