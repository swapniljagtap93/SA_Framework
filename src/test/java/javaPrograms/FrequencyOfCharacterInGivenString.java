package javaPrograms;

public class FrequencyOfCharacterInGivenString {

	public static void main(String[] args) {


		int[] counter = new int[256];
		String str = "WelcomeTo@Java$Programming:Launguage:"; 
		
		for(int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			counter[(int) ch]++;
		}
		
		
		for(int i = 0; i < counter.length; i++)
		{
			if(counter[i] > 0)
			{
				System.out.println((char) i+ " : "+counter[i]);
			}
			
		}
	}


}
