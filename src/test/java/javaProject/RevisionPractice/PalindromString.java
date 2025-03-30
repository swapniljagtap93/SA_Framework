package RevisionPractice;

import java.util.Scanner;

public class PalindromString {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to check whether it is Palindrome or not");
        String str = sc.nextLine();
        String rev = "";
        String orgStr= str;

        for(int i = str.length()-1; i >= 0; i--)
        {
            rev = rev+str.charAt(i);
        }
        System.out.println(rev);
        if(orgStr.equals(rev))
        {
            System.out.println("Palindrom");
        }else{
            {
                System.out.println("Not a Palindrom");
            }
        }
    }
}
