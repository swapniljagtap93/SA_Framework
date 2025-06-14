package AJ;

public class OddOrEven {
    public static void main(String[] args) {

        int num = 1234589;
        int evenCount = 0;
        int oddCount = 0;

        while (num > 0) {
            int rem = num % 10;
            if (rem % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            num = num / 10;   // eliminate last digit
        }
        System.out.println("Even count is " + evenCount);
        System.out.println("Odd count is " + oddCount);

    }
}
