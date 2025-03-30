package AJ;

public class SumOfDigitsInANumber {
    public static void main(String[] args) {
        int num = 97872;
        int sum = 0;

        while (num > 0) {
            sum = sum + num % 10;  //4+3+2+1=
            num = num / 10;
        }
        System.out.println(sum);
    }
}
