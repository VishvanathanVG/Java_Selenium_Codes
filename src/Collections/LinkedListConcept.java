package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> ll = new LinkedList<String>();
		
		//add value
		ll.add("Vishva");
		ll.add("Gomathi");
		ll.add("Mouneesh");
		ll.add("Sreenish");
		
		//print all value
		System.out.println("linked list content are : " + ll);
		//add first 
		ll.addFirst("Veerabathiran");
		
		//add last
		ll.addLast("Suseela");
		
		System.out.println("linked list content are : " + ll);
		
		//add in particular index
		ll.add(1, "Marimuthu");
		System.out.println("linked list content are : " + ll);
		
		//get particular index value
		
		System.out.println(ll.get(0));
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		
		//remove method
		ll.remove(1);
		System.out.println("linked list content are : " + ll);
		ll.removeFirst();
		ll.removeLast();
		System.out.println("linked list content are : " + ll);
		
		//print value using for loop ,advanced for loop , iterator and while loop
		
		System.out.println("******************** uisng for loop");
		
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		
		
		System.out.println("********************uisng advanced for loop");
		
		for (String str : ll) {
			System.out.println(str);
		}
		
		System.out.println("********************using iterator");
		
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("********************for while loop");
		
		int j=0;
		while(ll.size()>j) {
			System.out.println(ll.get(j));
			j++;
		}
		
	}

}
