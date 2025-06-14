package javaPrograms;

public class OccDemo {

	public static void main(String[] args) {
		String str = "WelComewelcomeWELCOME";
		int[] charCount = new int[256];

		// Loop through the string and count character occurrences
		char[] ch = str.toCharArray();
		
		for (char c : ch) {
		//  charCount[(int) c]++;
			charCount[c]++;
		}

		// Print the count of a specific character (e.g., 'l')
		System.out.println("Character 'e' occurs " + charCount['e'] + " times.");
		
		
		// Ascii program 
//		// Character whose ASCII is to be computed
//        char ch = 'z';
//        // Typecasting the character to int and
//        // printing the same
//        System.out.println("The ASCII value of " + ch
//                           + " is: " + (int)ch);
	}

}
