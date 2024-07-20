package javaPrograms;

public class Aplaprogramocc {

	public static void main(String[] args) {

		String str = "WelcometotheJavaw";
		int[] charCount = new int[256];

		for (int i = 0; i < str.length(); i++) {
			
//			if(Character.isWhitespace(str.charAt(i)))
//			{
//				continue;
//			}
			
			charCount[(int) str.charAt(i)]++;   // W = 1  e = 1, l = 1
		}

		for (int i = 0; i < 256; i++) 
		{
			if(charCount[i] > 0)
			{
				System.out.println((char) i+ " = "+charCount[i]);
			}
		}

	}

}
