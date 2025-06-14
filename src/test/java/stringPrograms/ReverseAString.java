package stringPrograms;

public class ReverseAString {

	public static void main(String[] args)
	{
		String str = "I am from nandurbar and living in Pune";

//        String rev = "";
//        for(int i = str.length()-1; i >= 0; i--)
//        {
//        	System.out.print(str.charAt(i));
//        }

	// reverse a word nandurbar at same place
	
		String[] arr = str.split("\\s");
		for(String a : arr)
		{
			if(a.equals("nandurbar"))
			{
				StringBuilder sb = new StringBuilder(a);
				System.out.print(sb.reverse()+" ");
				continue;
			}
			System.out.print(a+" ");
		}
	}
	
}
