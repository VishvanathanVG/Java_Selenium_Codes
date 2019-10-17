package JavaBasics;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//+ sign is concatenation operator 
		
		int a =100;
		int b = 200;
		
		double d = 10.33;
		double d1 =12.33;
		
		String x = "hello";
		String y = "world";
		
		System.out.println(a+b);
		System.out.println(x+y);
		
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y+a+x+b+y);
		
		System.out.println(d+d1);;
		System.out.println(x+y+d+d1);
		
		System.out.println("the value of a is:" +a);
		System.out.println("the value of a & b is:"+(a+b));
		
		//ln used for printing output in new line 
		//print -  is use to print on the console
		//println - use to print on the console with a new line
		System.out.print("Hello selenium");
		System.out.println("hello testing");
		
		System.out.println("next");
		System.out.print("Hello selenium1");
		System.out.println("hello testing1");
	}

}
