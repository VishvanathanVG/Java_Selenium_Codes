package OOPSConceptPart1;

public class LocalandGlobalVar {

	//global variables
	String S = "Vishva";
	int age =29;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i =10;//local variable
		LocalandGlobalVar ob=new LocalandGlobalVar();
		System.out.println(ob.age);
	    System.out.println(ob.S);

	}


	public void sum() {
		 //local variable
		int i=10;
		int j=20;
		int age=29;
				
	}
}
