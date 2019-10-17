package Collections;

import java.util.HashMap;
import java.util.Map.Entry;

import net.bytebuddy.description.modifier.SynchronizationState;

public class HashMapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Vishva");
		hm.put(2, "Gomathi");
		hm.put(3, "Mouneesh");
		hm.put(4, "Sreenish");
		
		//print all value
		System.out.println(hm);
		
		System.out.println(hm.get(1));
		
		//for all value
		for(Entry e :hm.entrySet()) {
			
			System.out.println(e.getKey() +" "+e.getValue());
		} 
		
		HashMap<Integer,Employee> hm1 = new HashMap<Integer,Employee>();
		
		Employee e1 = new Employee("Tom", 27, "Admin");
		Employee e2 = new Employee("Jerry", 28, "Funny");
		Employee e3 = new Employee("Vishva", 28, "Testing");
		
		hm1.put(1, e1);
		hm1.put(2, e2);
		hm1.put(3, e3);
		
		//traverse
		for(Entry<Integer, Employee> m: hm1.entrySet()) {
			int empkey =m.getKey();
			Employee empValue = m.getValue();
			System.out.println(empkey);
			System.out.println(empValue.name+" "+empValue.age+" "+empValue.dept);
			
		}
	}

}
