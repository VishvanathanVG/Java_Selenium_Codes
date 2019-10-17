package OOPSConceptPart1;

public class StaticAndNonStaticConcept {

	String name ="Vishva";
	static int age =29;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        //Static method abd vars can call in 2 way
		
		//1. by using classname 
		
		StaticAndNonStaticConcept.myAge();
		
		
		//2.directly calling.
		
		System.err.println(age);
		
		
		//calling Nonstatic method using method and vars
		
		//by using object reference should call static method
		
		StaticAndNonStaticConcept ob=new StaticAndNonStaticConcept();
		ob.myName();
		
		//Can we call static method by using object reference variable ? Yes,but it will show warning static method should call in sttaic way
		
      //ob.myAge();		
		
	}

	public void myName() {
		
		System.out.println("MyName method");
	}
	
	public static void myAge() {
		
		System.out.println("MyAge method");
	}
	
	
	
}
