package Learning

import java.util.Arrays;

            public class ArraysDemo {
                public static void main(String[] args) {
                    int arr[] = {26, 23, 45, 65, 78, 34, 10};
                    System.out.println("Original Array = " + Arrays.toString(arr));
                    int arrLength = arr.length;
                    for (int i = 0; i < 3; i++)
                    {
                        for (int j = i + 1; j < 3; j++)
                        {
                            if (arr[i] > arr[j]) {
                                int temp = arr[i];
                                arr[i] = arr[j];
                                arr[j] = temp;
                            }
                        }
                    }
                    System.out.println(Arrays.toString(arr));
                }
            }