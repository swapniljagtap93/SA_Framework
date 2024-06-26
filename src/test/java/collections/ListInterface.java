package collections;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {
	
		//ArrayList
		
		List<String> list = new ArrayList<String>();
		
		list.add("Swapnil");
		list.add("Ajay");
		
		System.out.println(list.get(0));
		
		list.remove(0);
		
		System.out.println(list.get(0));
		
		list.add(0, "Swapnil Jagtap");
		System.out.println(list.get(0));
	
		
		List<String> list2 = new ArrayList<String>();
		list2.add("one");
		list2.add("Two");
		
		list.addAll(0, list2);
		
		System.out.println(list);
	}

}
