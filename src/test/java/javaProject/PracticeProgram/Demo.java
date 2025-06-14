package PracticeProgram;

public class Demo {

    public static void main(String[] args)
    {
        int k = 0;
        for(int i = 1; i<5; i++)
        {
            for(int j = 1; j<i+1; j++)
            {
                k++;
                System.out.print(k);
                System.out.print('\t');
            }
            System.out.println(" ");
        }
    }


}
