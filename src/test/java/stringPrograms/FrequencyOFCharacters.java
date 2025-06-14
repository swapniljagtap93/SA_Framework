package stringPrograms;

public class FrequencyOFCharacters {

	public static void main(String[] args) {
		String str = "I am from nandurbar and living in Pune";
        String[] arr = str.split("\\s");
        
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i].equals("nandurbar"))
			{
				for(int j = 0; j < arr[i].length(); j++)
				{
					arr[i].charAt(j);
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
