package collections;

import java.util.List;
import java.util.Stack;

public class Stack_List {

	public static void main(String[] args) {

		{
//			// Size of the stack
//			int n = 5;
//
//			// Declaring the List
//			List<Integer> s = new Stack<Integer>();
//
//			// Appending the new elements
//			// at the end of the list
//			for (int i = 1; i <= n; i++)
//				s.add(i);
//
//			// Printing elements
//			System.out.println(s);   // [1,2,3,4,5]
//
//			// Remove element at index 3
//			s.remove(3);
//
//			// Displaying the list after deletion
//			System.out.println(s);   // [1,2,3,5]
//
//			// Printing elements one by one
//			for (int i = 0; i < s.size(); i++)
//				System.out.print(s.get(i) + " ");    
//			
//			s.add(67);
//			System.out.println(s);
//			
//			s.add(50);
//			System.out.println(s);

//			List<String> list = new Stack<String>();
//			
//			int limit = 6; 
//			
//			list.add("MCA");
//			list.add("BCA");
//			list.add("BBA");
//			list.add("MBA");
//			list.add("IT");
//			list.add("Commerce");
//			
//		
//		     for (int i = 0; i < limit; i++)
//					System.out.println(list.get(i) + " ");   
//			
//		    list.add("BA");
//			System.out.println(list);

			Stack<Integer> stack = new Stack<Integer>();
			// Push elements onto the stack
			stack.push(11);    
			stack.push(22);
			stack.push(33);
			stack.push(44);

	        System.out.println(stack);
	        
	        // Pop elements from the stack
//	        while(!stack.isEmpty()) {
//	            System.out.println(stack.pop());
//	        }

			for (int i = 0; i <= stack.size(); i++) {
				System.out.println(stack.pop());
			}

			
			Integer p =  stack.peek();
			System.out.println(p);
			
		}

	}

}
