package JavaBasics;

public class ArrayConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //To Store similiar data types values in array variables
		
		//lowest bound/index value is 0
		//hightes bound /index --> n-1 n is size of array
		
		
		//disadvantage
		//1.size is fixed because static array - to over come this problem - we use collections - arraylist ,hashtable
		//2.store only similar data types value - To over come this problem -- we use object array
		
		
		//1.integer array
		
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[0]);
		System.out.println(i[3]);
		
		//length of array print
		
		System.out.println(i.length);
		
		///System.out.println(i[4]); //array index out of boudn exception
		
		//for loop to print
		
		System.out.println("********************for loop***********************");
		
		for (int j=0;j<i.length;j++) {
			System.out.println(i[j]);
		}
		
		
		//2.double array
		
		double d[]=new double[3];
		d[0]=10.33;
		d[1]=13.33;
		d[2]=14.55;
		
		System.out.println(d.length);
		System.out.println(d[2]);
		
		System.out.println("*************forloop***************");
		
		for(int k=0;k<d.length;k++) {
			
			System.out.println(d[k]);
		}
				
		
		
		//3.Char array
		
		char c[]=new char[4];
		c[0]='a';
		c[1]='b';
		c[2]='c';
		c[3]='d';
		
		
		//4.boolean array
		
		boolean b[]=new boolean[2];
		b[0]=true;
		b[1]=false;
		
		//5.String array
		String s[]=new String[3];
		s[0]="Hi";
		s[1]="Vishva";
		s[2]="how are you";
		
		System.out.println(s[1]);
		System.out.println(s.length);
	    System.out.println(s[0]+s[1]+s[2]);
		
		
		//6.Object array
	    
	    //object is superclass
	    
	    Object ob[]=new Object[4];
		ob[0] = "Vishva";
		ob[1] = 29;
		ob[2] = 19.55;
		ob[3] = 'M';
		
		System.out.println(ob[0]);
		System.out.println(ob.length);
		
		for (int m=0;m<ob.length;m++) {
			
			System.out.println(ob[m]);
		}
		
		
		
	}

}
