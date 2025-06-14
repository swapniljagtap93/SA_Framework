package RevisionPractice;

public class Swap2Numbers {

    public static void main(String[] args)
    {
        int num1 = 10, num2 = 20;

        //Logic 1
//        int temp = num2;
//        num2 = num1;
//        num1 = temp;

        //Logic 2
        num1 = num1 + num2;  //30
        num2 = num1 - num2;  //10
        num1 = num1 - num2;  //20
        System.out.println(+num1+" "+num2);
    }
}
