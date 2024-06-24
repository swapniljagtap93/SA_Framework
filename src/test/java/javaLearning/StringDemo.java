package javaLearning;

public class StringDemo {

	public static void main(String[] args) {


		// Immutable
		String str = new String("Welcome to java Programming");
        System.out.println(str);
        System.out.println(str.concat("Swapnil"));
        System.out.println(str);
     
        //mutable 
        StringBuffer demoString = new StringBuffer("GeeksforGeeks");
        System.out.println(demoString.reverse());
        System.out.println(demoString.append("only for learner"));
        System.out.println(demoString);
        
        StringBuilder sb = new StringBuilder("Java");
        System.out.println(sb.reverse());
        System.out.println(sb.append("only for learner"));
        System.out.println(sb);
	}

}
