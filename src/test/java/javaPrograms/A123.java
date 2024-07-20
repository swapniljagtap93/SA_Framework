package javaPrograms;

public class A123 {

	public static void main(String[] args) {


		String str = "BAbcd%&^$#$AjayIngole";
		
		int counter[] = new int[256];  // to get ascii values

		for(int i = 0; i < str.length(); i++)
		{
			counter[(int) str.charAt(i)]++;
		}
		
		for(int i = 0 ; i < 256; i++)
		{
			if(counter[i] > 0)
			{
			System.out.println((char) i+ " : "+counter[i]);
			}
		}
	}

}
