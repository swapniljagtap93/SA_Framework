package patternPrograms;

public class TopTraingle {
    public static void main(String[] args)
    {
        for(int i = 1; i < 5; i++)
        {
            for(int j = i; j < 5; j++)
            {
                System.out.print("*");
                System.out.print("\t");
            }
            System.out.println(" ");
        }
    }
}
