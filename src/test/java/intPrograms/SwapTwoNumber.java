package intPrograms;

public class SwapTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a  = 1000, b = 2000;
		
		a = a + b; 
		b = a - b; 
		a = a - b; 
		
		System.out.println("After swapping "+a+ " : " +b);

	}

}
