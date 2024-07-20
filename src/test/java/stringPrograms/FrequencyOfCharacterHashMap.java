package stringPrograms;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacterHashMap {

	public static void main(String[] args) {

//		String str = "I am from nandurbar and living in Pune";
//		
//		Map<Character, Integer> m = new HashMap<>();
//
//		for(int i = 0; i < str.length(); i++)
//		{
//			if(m.containsKey(str.charAt(i)))
//			{
//				m.put(str.charAt(i), m.get(str.charAt(i))+1);
//			}else
//			{
//				m.put(str.charAt(i), 1);
//			}
//		}
//		
//		for(int i = 0; i < str.length(); i++)
//		{
//			if(m.get(str.charAt(i))> 0)
//			{
//               System.out.println(str.charAt(i)+" "+m.get(str.charAt(i)));	
//               m.put(str.charAt(i), 0);
//			}
//		}
		// logic 2nd
		String str = "I am from nandurbar and living in Pune";
		Map<Character, Integer> m = new HashMap<>();
		char[] ch = str.toCharArray();
		for (Character s : ch) {
			if (m.containsKey(s)) {
				m.put(s, m.get(s) + 1);
			} else {
				m.put(s, 1);
			}
		}

		for (Character c : ch) {
			if (m.get(c) > 0) {
				System.out.println(c + " " + m.get(c));
				m.put(c, 0);
			}
		}
	}

}
