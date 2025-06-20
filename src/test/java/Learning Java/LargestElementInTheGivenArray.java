package Learning

public class LargestElementInTheGivenArray {
    public static void main(String[] args) {
        int arr[] = {9, 45, 8, 56, 34, 5};

        int largestNum = arr[0];

        for(int i = 1; i <= arr.length-1; i++)
        {
            if(arr[i] > largestNum)
            {
                largestNum = arr[i];
            }
        }
        System.out.println(largestNum);
    }
}
