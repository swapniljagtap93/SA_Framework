package Learning;

// Package: src/test/java
public class RevereseWordFromTheGivenSentence2 {
    public static void main(String[] args) {

        String str = "Get the future you want";

        String words[] = str.split(" ");

        for (int i = 0; i < words.length; i++)
        {
         //   System.out.println(words[i]);
            if(words[i].equalsIgnoreCase("future"))
            {
               for(int j = words[i].length()-1; j>=0; j--)
               {
                   System.out.print(words[i].charAt(j));
               }
               continue;
            }
            System.out.print(" "+words[i]+" ");
        }

    }
}
