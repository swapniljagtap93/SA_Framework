package PracticeProgram;

public class reverseString {

    public static void main(String[] args){

       // Scanner sc = new Scanner(System.in);
        String str = "Swapnil";

        String rev = "";

        for(int i = str.length()-1; i>=0; i--)
        {
            rev= rev+str.charAt(i);
        }
        System.out.println("Reverse of given string "+rev);
    }
}
