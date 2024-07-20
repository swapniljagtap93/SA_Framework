package javaPrograms;

public class FrequencyOfChar {

	public static void main(String[] args) {

		String str = "Welcome to the Capgemini Swapnil Jagtap";
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (Character.isWhitespace(ch)) {
				continue;
			}

			int count = 0;

			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == ch) {
					count++;
				}
			}
			System.out.println(ch + " is repeated " + count + " times");
		}
	}

}
