package Learning

public class ReverseWord {
                    public static void main(String[] args) {
                        String str = "Hello World";
                        String wordToReverse = "World";

                        String[] words = str.split(" ");
                        StringBuilder result = new StringBuilder();

                        for (String word : words) {
                            if (word.equals(wordToReverse)) {
                                StringBuilder sb = new StringBuilder(word);
                                result.append(sb.reverse().toString()).append(" ");
                            } else {
                                result.append(word).append(" ");
                            }
                        }

                        // Trim the trailing space and print the result
                        System.out.println(result.toString().trim());
                    }
                }