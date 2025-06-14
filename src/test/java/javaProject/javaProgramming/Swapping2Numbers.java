package javaProgramming;

public class Swapping2Numbers {

    public static void main(String[] args){

        int a = 10, b = 20;
        System.out.println("before swapping " +a+ " " +b);
//        int temp = a;
//        a=b;
//        b=temp;

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("after swapping " +a+ " " +b);

    }
}
