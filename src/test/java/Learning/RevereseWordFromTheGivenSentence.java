package Learning;

// Package: src/test/java
public class RevereseWordFromTheGivenSentence {
    public static void main(String[] args) {
        String sentence = "Get the future you want";

        String words[] = sentence.split(" ");

        for (String word : words)
        {
            if(word.equalsIgnoreCase("future"))
            {
                for(int i = word.length()-1; i >= 0; i--)
                {
                    System.out.print(word.charAt(i));

                }
                continue;
            }
            System.out.print(" "+word+" ");
        }

    }
}
