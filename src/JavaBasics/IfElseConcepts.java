package JavaBasics;

public class IfElseConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 20;
	
		if (a>b) {
			System.out.println("a is greater than b");
		}
		else {
			 System.out.println("b is greater than a");
		}
		
		//comparison operators
		// < > <= >= == !=
		
		int i = 30;
		int j = 30;
		
		if (i==j) {
		System.out.println("i & j are equal");
		}
		else {
			System.out.println("i & j not equal");
		}
		
		
		//find a highest number
		
		int a1=400;
		int b1=200;
		int c1=300;
		
		if(a1>b1 & a1>c1) {
			System.out.println("a1 is greatest");
			}
		else if (b1>a1 & b1 >c1) {
		System.out.println("ba is greatest");
	        }
		else {
			System.out.println("c1 is greatest");}
		
	
	   //find a lowest number
	    int a2 = 200;
	    int b2 = 300;
	    int c2 = 500;
	    
	    if (a2<b2 & a2<c2) {
	    	System.out.println("a2 is lowest");
	    }
	    else if (b2<c2 & b2 < a2) {
	    	System.out.println("b2 is lowest");
	    }
	    else {
	    	System.out.println("c2 is lowest");
	    }
	}
}
