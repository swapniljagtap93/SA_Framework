package encapsulationPractice;

public class SubClass extends SuperClass {

	public static void main(String[] args) {

		SuperClass sb = new SubClass();
		sb.setNum(10);
		sb.setName("Swapnil");
		
		System.out.println(+sb.getNum()+ "  "+sb.getName());
	}

}
