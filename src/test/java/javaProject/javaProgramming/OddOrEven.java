package javaProgramming;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        int EvenCount = 0, OddCount = 0;

        while(num > 0)
        {
            int rem = num%10;
            if(rem%2 == 0)
            {
                EvenCount++;
            }
            else {
                OddCount++;
            }
            num = num/10;

        }
        System.out.println("Count of Even digits in given number is "+EvenCount);
        System.out.println("Count of Odd digits in given number is "+OddCount);
    }
}
