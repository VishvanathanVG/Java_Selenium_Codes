package OOPSConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="100";
		//Converting to Integer value
		
		int s1=Integer.parseInt(s);
		System.out.println(s1+200);
		
		
		//Wrapper classes are Integer,Double,Boolean & String
		
		
		//Converting string value to double
		
		String a ="10.33";
		double d = Double.parseDouble(a);
		System.out.println(d+12.33);
		
		
		//Converting string value to boolean
		
		String b="true";
		boolean b1 =Boolean.parseBoolean(b);
		System.out.println(b1);
		
		//Converting int to string
		
		int i =100;
		
		String S2 =String.valueOf(i);
		System.out.println(S2+120);
		
		String u ="100A";//Number format exception
		Integer.parseInt(u);
		
	}

}
