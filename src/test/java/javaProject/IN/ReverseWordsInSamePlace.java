package IN;

public class ReverseWordsInSamePlace {

    public static class ReverseWord {

        public static String reverseWord(String str) {
            String words[] = str.split("\\s");
            String reverseWord = "";
            for (String w : words) {
                StringBuilder sb = new StringBuilder(w);
                sb.reverse();
                reverseWord += sb.toString() + " ";
            }
            return reverseWord.trim();
        }
    }

    public static void main(String[] args) {
        System.out.println(ReverseWord.reverseWord("my name is khan"));
        System.out.println(ReverseWord.reverseWord("I am sonoo jaiswal"));
    }

}
