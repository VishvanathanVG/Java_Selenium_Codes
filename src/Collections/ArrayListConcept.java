package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList ar = new ArrayList();

		ar.add(1100);
		ar.add(200);
		ar.add(300);
		System.out.println(ar.size());

		ar.add(10);
		ar.add(20);
		System.out.println(ar.size());

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		// Can define data type as well
		// 1.Integer based
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		ar2.add(1000);
		ar2.add(2000);

		// 2.String based
		ArrayList<String> ar3 = new ArrayList<String>();
		ar3.add("Selenium");
		ar3.add("QTP");
		ar3.add("Appium");
		ar3.add("LoadRunner");

		// Print all vales from array
		for (int i = 0; i < ar3.size(); i++) {
			System.out.println(ar3.get(i));
		}

		Employee e1 = new Employee("Vishva", 28, "Testing");
		Employee e2 = new Employee("Gomathi", 27, "HouseWife");
		Employee e3 = new Employee("Mouneesh", 3, "FirstChild");
		Employee e4 = new Employee("Sreenish", 1, "SecondChild");
		// System.out.println(e1.name);

		// print each employee data
		ArrayList<Employee> ar4 = new ArrayList<Employee>();

		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		ar4.add(e4);

		// iterator to traverse the value

		Iterator<Employee> it = ar4.iterator();
		while (it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}

		System.out.println("************************");

		// addall()
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("Vishva");
		ar5.add("Mouneesh");
		ar5.add("Sreenish");

		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("Test");
		ar6.add("Selenium");
		ar6.add("Qtp");

		ar5.addAll(ar6);

		for (int i = 0; i < ar5.size(); i++) {
			System.out.println(ar5.get(i));
		}

		System.out.println("************************");

		// remove all

		ar5.removeAll(ar6);

		for (int i = 0; i < ar5.size(); i++) {
			System.out.println(ar5.get(i));
		}

		System.out.println("************************");
		// retain all
		ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("Vishva");
		ar7.add("Mouneesh");
		ar7.add("Sreenish");

		ArrayList<String> ar8 = new ArrayList<String>();
		ar8.add("Vishva");
		ar8.add("Selenium");
		ar8.add("Qtp");

		ar7.retainAll(ar8);// retain common values only

		for (int i = 0; i < ar7.size(); i++) {
			System.out.println(ar7.get(i));
		}

	}

}
