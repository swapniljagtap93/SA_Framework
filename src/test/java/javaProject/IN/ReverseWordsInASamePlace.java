package IN;

public class ReverseWordsInASamePlace {

    public static void main(String[] args) {
        String sentence = "my name is khan";
        String words[] = sentence.split("\\s");
        String reverseWord = "";

        for (String w : words) {
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            reverseWord += sb.toString() + " ";
        }

        System.out.println(reverseWord.trim());
    }
}