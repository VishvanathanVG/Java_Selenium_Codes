package JavaBasics;

public class FinallyConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		test3();

	}

   //Method 1
	public static void test1() {

		try {
			System.out.println("test1 try block");
		} catch (Exception e) {
			System.out.println("test1 catch");
		}

		finally {
			System.out.println("final block 1");
		}
	}

	// Method 2
	public static void test2() {
		try {
			System.out.println("test2 try block");
			int i = 0;
			int k = i / 0;

		} catch (ArithmeticException e) {
			System.out.println("test2 catch");
		}

		finally {
			System.out.println("final block 2");
		}

	}

	
	//Method 3
	public static void test3() {
	try {
		System.out.println("test3 try block");
		int i = 0;
		int k = i / 0;

	} catch (NullPointerException e) {
		System.out.println("test3 catch");
	}

	finally {
		System.out.println("final block 3");
	}
}
}
