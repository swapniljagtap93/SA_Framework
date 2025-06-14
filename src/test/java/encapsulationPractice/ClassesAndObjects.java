package encapsulationPractice;

public class ClassesAndObjects {


	public static int num = 10;
	
	public void animals()
	{
		System.out.println("Tiger , Lion, Elephent");
	}
	
	public static void colors()
	{
		System.out.println("Blue , Black, Orange");
	}
	
	public static void main(String[] args) {

		System.out.println("Colors method contains - ");
		colors();
		
		ClassesAndObjects cao = new ClassesAndObjects();
		cao.animals();
		
		System.out.println(num);
	}

}
