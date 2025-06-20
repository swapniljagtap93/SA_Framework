package Learning

import java.util.Arrays;

public class SortUpToFour {
    public static void main(String[] args) {

        int arr[] = {15, 11, 13, 9, 8, 90,7, 4, 78};
        System.out.println(Arrays.toString(arr));

        for(int i = 0; i <= 3; i++)
        {
            for(int j = i + 1; j <= 3; j++)
            {
                if(arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
