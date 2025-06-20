package Learning

public class reverseWordfs {
    public static void main(String[] args) {
        String str = "Get the future you want";
         // reverse the future word
        String words[] = str.split(" ");                                  //words = {Get, the, future, you, want}

        for(String word : words)   //enhanced for loop    //1. Get
        {
            if(word.equalsIgnoreCase("future"))
            {
                for(int i = word.length()-1; i >=0; i--)
                {
                    System.out.print(word.charAt(i));
                }
                continue;
            }
            System.out.print(" "+word+" ");
        }

    }
}
