package Learning;

import java.util.Arrays;

public class SortUpToThree {
    public static void main(String[] args) {
        int arr[] = {23, 20, 21, 65, 43, 90, 34};
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
