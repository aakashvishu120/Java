package constructor;

public class Noargs {
	
	private int num1;
	private int num2;
	
	Noargs(){
		num1 = 2;
		num2 = 5;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Noargs obj = new Noargs();
		System.out.println(obj.num1);
		System.out.println(obj.num2);
	}

}
