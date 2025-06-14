package RevisionPractice;

public class OddOrEven {
    public static void main(String[] args) {
        int num = 8734798;
        int oddCount = 0, evenCount = 0;

        while (num > 0) {
            int rem = num % 10;      // to take a last digit and do the operation on it
            if (rem % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            num = num / 10;         // to eliminate last digit
        }
        System.out.println(+evenCount+" "+oddCount);
    }
}
