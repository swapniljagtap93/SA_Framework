package Learning

public class SortArrayUpToFiveElement {
                public static void main(String[] args) {
                    int[] arr = {15, 3, 27, 8, 12, 5, 19};
                    System.out.println("Original array: " + java.util.Arrays.toString(arr));

                    // Sort only the first three elements
                    for (int i = 0; i < 3; i++) {
                        for (int j = i + 1; j < 3; j++) {
                            if (arr[i] > arr[j]) {
                                int temp = arr[i];
                                arr[i] = arr[j];
                                arr[j] = temp;
                            }
                        }
                    }

                    System.out.println("Array after sorting first three elements: " + java.util.Arrays.toString(arr));
                }
            }