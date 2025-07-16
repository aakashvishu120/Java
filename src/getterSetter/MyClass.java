package getterSetter;

class Dog {
	private String breed;
	private String color;
	private int age;
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void showProperties() {
		System.out.println("Details : " + " " + this.breed + " " + this.color + " " + this.age);
		System.out.printf("Details : %s %s %d\n", this.breed, this.color, this.age);   //formatted print
	}
	
}


public class MyClass {
	public static void main(String args[]) {
		Dog ref = new Dog();
		ref.setBreed("german Shepard");
		ref.setColor("brown");
		ref.setAge(10);
		ref.showProperties();
		
	}
}

//In java i can make only one class public,  rest will be private