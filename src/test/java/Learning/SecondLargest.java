package Learning;

public class SecondLargest
{
    public static void main(String[] args) {
        int[] arr = {10, 20, 45, 21, 49, 67, 89};
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i <= arr.length; i++)
        {
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[i] > arr[j])
                {
                    largest = arr[i];
                }else
                {
                    largest = arr[j];
                }
            }
        }
        System.out.println("Second largest number is: " + largest);
    }
}
