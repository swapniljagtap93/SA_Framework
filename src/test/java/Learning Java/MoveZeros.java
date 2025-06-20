package Learning

import java.util.ArrayList;
import java.util.Arrays;

                        public class MoveZeros {
                            public static void main(String[] args) {
                                int[] array = {0, 1, 0, 3, 12};
                                System.out.println("Original array: " + Arrays.toString(array));

                                // Create lists to store non-zero and zero elements
                                ArrayList<Integer> nonZero = new ArrayList<>();
                                ArrayList<Integer> zero = new ArrayList<>();

                                // Separate non-zero and zero elements
                                for (int num : array) {
                                    if (num != 0) {
                                        nonZero.add(num);
                                    } else {
                                        zero.add(num);
                                    }
                                }

                                // Combine non-zero and zero lists
                                nonZero.addAll(zero);
                                System.out.println("Combined list: " + nonZero);
                            }
                        }