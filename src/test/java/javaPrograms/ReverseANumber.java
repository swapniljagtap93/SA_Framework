package javaPrograms;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
	
		System.out.println("Reverse a number");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
//		int rev = 0;
//		
//		while(num!=0)
//		{
//		    rev = rev*10+num%10;
//		    num = num / 10;
//		}
//		System.out.println(rev);
		
		 // Converting integer to string 
        // using toString() method 
        String str = Integer.toString(num);
        
        StringBuffer sb = new StringBuffer(str);
        StringBuffer rev1 = sb.reverse();
        System.out.println(rev1);
        
        int abc = Integer.parseInt(str);
        
	}

}
