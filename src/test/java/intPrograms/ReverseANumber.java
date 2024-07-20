package intPrograms;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 124567;
//		int rev = 0; 
//		
//		while(num > 0)
//		{
//			rev = rev*10 + num%10;	
//			num = num/10;
//		}
//	    System.out.println(rev);
     	String numStr = Integer.toString(num);
		StringBuffer rev  = new StringBuffer(numStr).reverse();
		System.out.println(rev);
	}

}
