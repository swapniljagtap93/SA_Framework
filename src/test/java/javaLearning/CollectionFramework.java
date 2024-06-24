package javaLearning;

import java.util.ArrayList;
import java.util.List;

public class CollectionFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("___*collection framework______*");
		System.out.println(" ");
		
		List<String> str = new ArrayList<String>();
		str.add("First");
		str.add("Second");
		str.add(0, "Zero");
		
		System.out.println(str);
		
		str.addFirst("Negative");
		System.out.println(str);
		
		System.out.println(str.get(0));		
		
		System.out.println(str.isEmpty());
		System.out.println(str.contains("First"));
		
		str.set(0, "NegativeNumber");
		System.out.println(str);
	}

}
