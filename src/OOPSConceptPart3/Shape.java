package OOPSConceptPart3;

public abstract class Shape {

	Shape(){
		
		System.out.println("shape class constructor");
	}
	
	abstract void drawing();
	
	public void writing() {
		
		System.out.println("shape -writing");
	}
	
}
