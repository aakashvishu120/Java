package constructor;

class Student {

	int age;
	Student(){
		this(20);
		System.out.println("calling no argument constructor");
	}
	
	Student(int age){
		this.age = age;
		System.out.println("calling parameterized constructor");
	}
	
	void ShowDetails() {
		System.out.println("Student Age : " + this.age);
	}
}

public class Main{
	public static void main(String[] args) {
		Student st = new Student();
		st.ShowDetails();
		
		//calling parameterized constructor
//		Student st2 = new Student(18);
//		st2.ShowDetails();
		
	}
}
