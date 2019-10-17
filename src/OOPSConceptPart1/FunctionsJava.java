package OOPSConceptPart1;

public class FunctionsJava {

	
	//execution point program
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunctionsJava f1=new FunctionsJava();
		
		//one object will be created and f1 is the reference variable for this object
		//copy of all non static method given to this object
		f1.pqr();
		f1.qa();
		f1.test();
		f1.division(20, 10);
		
		
		int i = f1.pqr();
		
		String so=f1.qa();
		
		int d1=f1.division(20, 10);
		
		System.out.println(i);
		System.out.println(so);
		System.out.println(d1);
		
		System.out.println(f1.pqr());
		System.out.println(f1.qa());
	
	//main method - never return any values
	}
		//functions and methods are same
		
		
	//1. Non static method
	
		//void - doesnot return any values
		public void test() //called method no input, no output
		{
			
		
		}
		
		//returning some value - should not use void 
		public int pqr() { //no input some output
			
			int a = 10;
			int b = 20;
			int c = a + b;
			
			return c;
			
			
		}

		
		public String qa() { //no input some output
			
			String s="Selenium";
			String s1="Selenium1";
			
			return s1;
		}

		
		public int division(int x, int y) {
			
			int d=x/y;
			
			return d;
		}
		
		
}
