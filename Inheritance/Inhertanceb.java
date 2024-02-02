class Vehicle{
	int wheels = 4;
	
	void displayWheels() {
		System.out.println("Number of wheels: "+wheels);
	}
}

class Car extends Vehicle{ // Single inheritance
	int seats = 2;
	
	void displayCar(){
		System.out.println("Number of wheels: "+ wheels);
		System.out.println("Number of seats: "+ seats);
	}
}

class SportsCar extends Car{ // Multilevel inheritance
	int horsepower = 300;
	boolean convertible=true;
	void displaySportsCar() {
		System.out.println("This is a sports car with "+wheels+" wheels "+seats+" seats and "+ horsepower+" horsepower.");
		System.out.println("This is "+ (convertible?"":"not ")+"a convertible");
	}
}

public class Inhertanceb {
	
	public static void main(String[] args) {
		SportsCar c = new SportsCar();
		c.displayCar();
		c.displayWheels();
		c.displaySportsCar();
	}
	
}
