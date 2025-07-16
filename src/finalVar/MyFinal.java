package finalVar;

class Dog{
	final String name = "tom";
}

public class MyFinal {
	public static void main(String args[]) {
		Dog obj = new Dog();
//		obj.name = "kitty";   //cannot change var having final keyword attached/ readonly
		System.out.print(obj.name);
	}
}
