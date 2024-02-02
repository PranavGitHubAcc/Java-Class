class Animal{
	int legs = 4;
	
	void displayLegs() {
		System.out.println("It has "+legs+" legs.");
	}
}

class Dog extends Animal{
	String sound = "barks";
	
	void displayDog() {
		System.out.println("A dog "+sound+ " and has "+ legs+ " legs.");
	}
}

class Lab extends Dog{
	boolean cute = true;
	
	void displayLab() {
		System.out.println("A lab is "+(cute?"":"not ")+"cute, it "+sound+" and has "+ legs+ " legs.");
	}
}

public class Inheritancec {
	public static void main(String[] args) {
		Lab l = new Lab();
		l.displayLegs();
		l.displayDog();
		l.displayLab();
	}
	
}
