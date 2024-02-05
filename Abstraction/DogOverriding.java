class Dog{
	void bark() {
		System.out.println("Parent dog is barking.");
	}
}

class ChildDog extends Dog{
	void bark() {
		System.out.println("Child dog is barking.");
	}
	
}
public class DogOverriding {
	public static void main(String[] args) {
		ChildDog d1 = new ChildDog();
		d1.bark();
		Dog d2 = new Dog();
		d2.bark();
		Dog d = new ChildDog(); // upcasting: data type of parent class but object of child class
		// run time polymorphism / run time dispatch
		d.bark();
		//  ChildDog s3 = new Dog(); this is invalid
	}
	
}
