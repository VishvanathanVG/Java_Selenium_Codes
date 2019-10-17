package JavaBasics;

public class TwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s[][] = new String[3][4];
		System.out.println(s.length);//length of row only
		System.out.println(s[0].length);//total number of columns
		
		s[0][0] = "A";
		s[0][1] = "B";
		s[0][2] = "C";
		s[0][3] = "D";
		
		s[1][0] = "A1";
		s[1][1] = "B1";
		s[1][2] = "C1";
		s[1][3] = "D1";
		
		s[2][0] = "A2";
		s[2][1] = "B2";
		s[2][2] = "C2";
		s[2][3] = "D2";
		
	
		System.out.println(s[0][0]);
		
		System.out.println(s[2][3]);
		System.out.println(s.length +"," + s[0].length);
		
		//print all values - use 2 for loop
		//row=0 col = 0 to 3;
		//row=1 col = 0 to 3;
		
		for (int row=0;row<s.length;row++) {
			
			for(int col=0;col<s[0].length;col++) {
				
				System.out.println(s[row][col]);
			}
			
			
		}
		
	}

}
