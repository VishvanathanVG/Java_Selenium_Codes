package JavaBasics;

import java.util.ArrayList;

public class ArrayListConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList ar=new ArrayList();
		ar.add(100);
		ar.add(200);
		ar.add("Vishva");
		ar.add('M');
		ar.add(12.55);
		//Get array size
		System.out.println(ar.size());
		//get index vakue
		System.out.println(ar.get(2));
      
		ar.remove(3);
		System.out.println(ar.size());
	   //To print all vallues
		
		System.out.println("********************");
		for (int i=0;i<ar.size();i++) {
			
			System.out.println(ar.get(i));
		}
		
		
		//To add only integer in arraylist
		
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ar1.add(100);
		
		
		//To add only String
		
		ArrayList<String> ar2=new ArrayList<String>();
		ar2.add("vishva");
		ar2.add("100");
	}

}
