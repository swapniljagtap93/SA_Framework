package RevisionPractice;

import java.util.Scanner;

public class PalindromNumber {

    public static void main(String[] args)
    {
        System.out.println("Enter a number to check wheher it is palindrom or not");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;
        int orgNum = num;

        while(num > 0)
        {
            rev = rev*10+num%10;
            num = num/10;
        }
        System.out.println("Reverse of given number is "+rev);
        if(orgNum == rev)
        {
            System.out.println("The given number is Palindrome number");
        }
        else
        {
            System.out.println("The given number is not a Palindrome number");
        }
    }
}
