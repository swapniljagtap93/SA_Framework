package IN;

public class Pattern {

    public static void main(String[] args) {

        int row = 5;
        for(int i = 0; i <= row; i++)
        {
            for(int j = i + 1; j <= row; j++)
            {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}


