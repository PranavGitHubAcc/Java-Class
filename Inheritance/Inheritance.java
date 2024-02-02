// there is no multiple inheritance in java - we need to use Interface for that
// In java we have to use "extends"
// Child class can access the members and member functions of the parent class. There is no need to create an object.
// Relationship types-
// Is a - unidirectional(car is a vehicle)
// Has a- aka composition(car has a engine), also unidirectional


// Super is used to reference the parent class
// This takes the reference of the current object
// Extends - used when declaring a child class

// Pojo class contains all the logic
// driver class is used for main

// Only the class containing the pvsm has to be public

// Constructor of parent class is in the parent class and child in child

class Parent{
	int a = 20;
	
	void displayParent() {
		System.out.println("Parent A"+" = "+a);
	}
}


class Child extends Parent{
	int b= 02;
	
	void displayChild() {
		System.out.println("Parent A = "+a);
		System.out.println("Parent B = "+b);
	}
}


public class Inheritance {
	public static void main(String[] args) {
		Child c = new Child();
		c.displayChild();
		c.displayParent();
	}
}
