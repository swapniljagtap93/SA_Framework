package Learning

import java.util.Arrays;

public class arrdDemo {
    public static void main(String[] args) {


        int[] intArray = {11, 22, 43, 24, 45};     //  [0, 1, 2,,4, 5]

        System.out.println(Arrays.toString(intArray));

        for (int i : intArray)
        {
            System.out.print(i + " ");
        }

    }
}
