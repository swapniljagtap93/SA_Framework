package javaPrograms;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Reverse a String");

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		
		StringBuffer sb = new StringBuffer(str);
		StringBuffer rev = sb.reverse();
		System.out.println(rev);
		
	}

}
