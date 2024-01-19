package test_class;

class Dog{
	private String name;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void dogBarks() {
		System.out.println(this.name+ "is barking");
	}
}

public class DogFunctions {
	public static void main(String[] args) {
		Dog dog = new Dog();
		System.out.println("Before getter and setter");
		System.out.println(dog.getAge());
		System.out.println(dog.getName());
		
		dog.setAge(2);
		dog.setName("Tommy");
		System.out.println("After getter and setter");
		System.out.println(dog.getAge());
		System.out.println(dog.getName());
		
		
		
	}
}
// operand 1 and 2,  4 methods, +-*/, main method, setter, call and print output