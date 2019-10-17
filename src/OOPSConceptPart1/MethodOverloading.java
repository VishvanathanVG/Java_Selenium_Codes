package OOPSConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MethodOverloading ob= new MethodOverloading();
		ob.sum();
		ob.sum(10);
		ob.sum(10, 5);
	}

	/*Method overloading - When method name is same with different arguments or different input parameters with in same class
	 * 
	 * You cannot create a method inside a method
	 * duplicate methods - same method name with same arguments not allowed
	 * Main method can be overload with different arguments
	 * */
	public void sum() { //o input param
		
		System.out.println("o input param");
		
	}
	
	
	public void sum(int i) { //1 input param
		
		System.out.println("1 input param");
		System.out.println(i);
	}


	public void sum(int j, int k) { //2 input param
		System.out.println("2 input param");
		System.out.println(j + k);
		
		
	}
}
