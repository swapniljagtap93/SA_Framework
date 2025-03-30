package javaProject.AJ;

import java.util.Arrays;

public class ArrayIndexZero {
    public static void main(String[] args) {
        /* Java program to move all zeroes to the right while maintaining the relative order of non-zero elements:
        int[] arr = {0, 1, 0, 3, 12, 0, 5};
        O/p - 1,3,12,5, 0,0,0
       */

        int[] arr = {34, 1, 0, 3, 12, 15, 0, 5};
        System.out.println("Original Array: " + Arrays.toString(arr));

        int index = 0;     //1

        for (int num : arr) {    // num = 34
            if (num != 0) {
                arr[index++] = num;    //  arr[0]= num      [34, ]
                                        //arr[1] = num   [34, 1]
                                        //arr[2] = num   []
            }
        }

        while (index < arr.length) {
            arr[index++] = 0;
        }

        System.out.println("Modified Array: " + Arrays.toString(arr));

    }

}
