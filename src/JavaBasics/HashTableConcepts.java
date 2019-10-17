package JavaBasics;

import java.util.Hashtable;

public class HashTableConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable h=new Hashtable();
		
		h.put("A", "Vishva");
		h.put("B", "Nathan");
		h.put("C", "19991");
		
		System.out.println(h.size());
		
		h.put(1, 100);
		h.put(2, "Vishvanathan");
		
		
		Hashtable<Integer,Integer> h1=new Hashtable<Integer,Integer>();
		h1.put(1, 100);
		h1.put(2, 200);
		
		Hashtable<String,String> h2=new Hashtable<String,String>();
		h2.put("S1", "Hash1");
		h2.put("S2", "Hash2");
		
		
	}

}
