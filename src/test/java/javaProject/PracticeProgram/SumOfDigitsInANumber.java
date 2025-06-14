package PracticeProgram;

public class SumOfDigitsInANumber {

    public static void main(String[] args)
    {
        int num = 1234;
        int sum = 0;

        while(num > 0)
        {
           sum=sum+num%10;      //0+4
           num=num/10;
        }
        System.out.println(sum);
    }
}
