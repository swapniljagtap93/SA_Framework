package Learning

public class StringReversed {
    public static void main(String[] args) {

        String string = "Regression";

        String reversedString = "";

        for (int i = string.length() - 1; i >= 0; i--)        // (i = 0; 0 >= 0; 0--)
        {
            reversedString = reversedString + string.charAt(i); //(n)
        }
        System.out.println("Reversed string: " + reversedString);
    }
}


// reversedString   = noissergeR