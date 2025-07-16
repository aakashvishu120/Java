package constructor;

public class Parameterized {

	private int num1;
	private int num2;
	
	Parameterized(int a, int b){
		num1 = a;
		num2 = b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parameterized obj = new Parameterized(10,5);
		System.out.println(obj.num1);
		System.out.println(obj.num2);
	}

}
