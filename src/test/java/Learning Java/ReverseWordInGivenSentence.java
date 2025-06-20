package Learning

public class ReverseWordInGivenSentence {
    public static void main(String[] args) {
        String str = "get the future you want";

        String[] splitted_str  = str.split(" ");

        for(String word : splitted_str)
        {
            if(word.equalsIgnoreCase("future"))
            {
                for(int i = word.length()-1; i >= 0 ; i--)
                {
                    System.out.print(word.charAt(i));

                }
                continue;
            }
            System.out.print(" ");
            System.out.print(word+" ");
        }
    }
}
