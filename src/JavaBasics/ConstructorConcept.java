package JavaBasics;

public class ConstructorConcept {

	String name;
	int model;
	int year;
	
	public ConstructorConcept() {
		
		System.out.println("Default Constructor");
	}
	
	public ConstructorConcept(int i) {
		
		System.out.println("1 param construct");
	}

	public ConstructorConcept(int a , int b) {
		System.out.println(a + ","+ b);
		System.out.println("2 param constructor");
	}
	
	public ConstructorConcept(String name , int model , int year) {
		
		this.name=name;
		this.model=model;
		this.year=year;
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorConcept obj=new ConstructorConcept();
		ConstructorConcept obj1=new ConstructorConcept(10);
		ConstructorConcept obj2=new ConstructorConcept(10,20);
		ConstructorConcept obj3=new ConstructorConcept("BMW",320,2010);
		ConstructorConcept obj4=new ConstructorConcept("Suzuki",120,2011);
		
		System.out.println(obj3.name+" "+ obj3.model + " "+ obj3.year);
		System.out.println(obj4.name+" "+ obj4.model + " "+ obj4.year);
	}

}
