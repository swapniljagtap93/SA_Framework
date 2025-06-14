package javaProgramming;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.next();
        String rev = "";
        String org_str;
        org_str=str;

        for(int i = str.length()-1; i>=0; i--)
        {
            rev= rev+str.charAt(i);
        }
        if(org_str.equals(rev))
        {
            System.out.println("Given String is palindrome");
        }
        else
        {
            System.out.println("Given String is not palindrome");
        }

    }
}
