package PracticeProgram;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args)
    {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int oddCount = 0, evenCount = 0;

        while(num > 0)
        {
            int rem = num%10;
            if(rem%2 == 0)
            {
                evenCount++;
            }
            else
            {
                oddCount++;
            }
            num = num/10;
        }
        System.out.println("Even digits count of given number is: "+evenCount);
        System.out.println("Odd digits count of given number is: "+oddCount);
    }
}
