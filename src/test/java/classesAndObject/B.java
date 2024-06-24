package classesAndObject;

public class B extends A {

	public static void main(String[] args) {

		B bobj = new B();
		bobj.set();
		bobj.setting();
		
	}

	void setting() {
		System.out.println("I am a B class, You can call me Child class");
	}

}
