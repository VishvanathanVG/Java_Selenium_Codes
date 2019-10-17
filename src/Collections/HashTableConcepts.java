package Collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable h1 = new Hashtable();
		h1.put("A", "Vishva");
		h1.put("B", "Gomathi");
		h1.put("C", "Mouneesh");
		h1.put("D", "Sreenish");

		System.out.println(h1);

		// clone or shallow copy
		Hashtable h2 = new Hashtable();
		h2 = (Hashtable) h1.clone();
		System.out.println("after cloning");
		System.out.println(h1);
		System.out.println(h2);

		if (h1.equals(h2)) {
			System.err.println("both r equal");
		}
		h1.clear();
		System.out.println("**********after clear");
		System.out.println("h1 value is :" + h1);
		System.out.println(h2);
		
		//contains value
		
		Hashtable h3 = new Hashtable();
		h3.put("A", "Selenium");
		h3.put("B", "QTP");
		h3.put("C", "LoadRunner");
		
		if(h3.containsValue("Selenium")) {
			System.out.println("Value contains");}
		
		//print all value using enumeration.
		Enumeration ele = h3.elements();
		System.out.println("from enumeration");
		while(ele.hasMoreElements()) {
			System.out.println(ele.nextElement());
		}
		
		//get all values from hashtable using entry set
		Set entrySet = h3.entrySet();
		System.out.println(entrySet);
		
	
		
		Hashtable h4 = new Hashtable();
		h4.put("A", "Selenium");
		h4.put("B", "QTP");
		h4.put("C", "LoadRunner");
		
		//both the hastbale object equ3al
		if(h3.equals(h4)){
			System.out.println("equal");
		}
		
		
		//get value from key
		System.out.println(h3.get("A"));
		
		
		//hascode value
		int hashCode = h4.hashCode();
		System.out.println(hashCode);
	
		System.out.println(h4.hashCode());

	}

}
