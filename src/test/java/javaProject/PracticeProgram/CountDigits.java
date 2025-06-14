package PracticeProgram;

import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num =  sc.nextInt();

        int count = 0;
        if(num == 0)
        {
            count++;
            System.out.println("Count of digits in given number is: "+count);
        }
        else
        {
         while(num > 0)
         {
             num = num/10;
             count++;
         }
        System.out.println("Count of digits in given number is: "+count);
        }
    }
}
