package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setCollection {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();

		set.add("Ghoda");
		set.add("Swapnil");
		set.add("Ajay");
		set.add("Nana");
		set.add("Kinjal");

		System.out.println(set);

		for (String value : set) {
			System.out.println(value);
		}
		
		Set<String> set2 = new HashSet<>();

		set2.add("animal");
		set2.add("Bird");
		set2.add("Bug");
		System.out.println(set2);

		for (String values : set2) {
			System.out.println(values);
		}
		
		set.addAll(set2);
		System.out.println(set);
		
		System.out.println(set.hashCode());
		
		
	}

}
