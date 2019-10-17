package JavaBasics;

public class LoopsConcetps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1.while loop -  infinite loop if we do not provide incremental/decremental - disadvantage
		//print 10 number
		int i =0;
	
		while (i<=20) {
			System.out.println(i);
			i=i+1;
			//System.out.println(i);
			}
		
		System.out.println("**************************************");
		
		//2.for loop
		//initialization,conditional part & incremental
		for (i=1;i<=10;i++) {
			System.out.println(i);
			}
		

		System.out.println("*****************for loop decremental*********************");
		
		for (int j=10;j>=-10;j--) {
			System.out.println(j);
		}
		
		


		
	}

}
