package Learning;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZeroToTheRightSide {
    public static void main(String[] args) {

        int arr[] = {10,0,11,0,9,0,56,34};
        System.out.println(Arrays.toString(arr));
        ArrayList<Integer> nonZero = new ArrayList<>();
        ArrayList<Integer> zero = new ArrayList<>();

        for(int num : arr)
        {
            if(num == 0)
            {
                zero.add(num);
            }else
            {
                nonZero.add(num);
            }
        }
        nonZero.addAll(zero);
        System.out.println(nonZero);
    }
}
