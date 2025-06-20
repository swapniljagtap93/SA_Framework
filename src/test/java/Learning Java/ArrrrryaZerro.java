package Learning

import java.util.ArrayList;
import java.util.Arrays;

public class ArrrrryaZerro {
    public static void main(String[] args) {

        System.out.println("Move all the zeros to the right side of the array");
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(23, 21, 0, 33, 12, 0, 56, 0, 34, 89));       // {1 ,2 ,3 ,4, 9, 8, 7, 6, 5}

        ArrayList<Integer> nonZeroList = new ArrayList<>();
        ArrayList<Integer> zeroList = new ArrayList<>();

        for (int elements : list) {
            if (elements == 0) {
                zeroList.add(elements);
            } else {
                nonZeroList.add(elements);
            }
        }

        nonZeroList.addAll(zeroList);
        list.clear();
        list.addAll(nonZeroList);
        System.out.println(list);
    }
}
