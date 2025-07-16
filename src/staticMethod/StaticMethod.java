package staticMethod;

public class StaticMethod {

	public static void func1() {
		System.out.println("static methods called");
	}

	public void func2() {
		System.out.println("non static method called");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		func1();
		StaticMethod obj = new StaticMethod();
		obj.func2();
	}

}
