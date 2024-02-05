class Shape1{
	void area(int a, int b) {
		System.out.println("Area");
	}
}

class Rectangle extends Shape1{
	void area(int a, int b) {
		System.out.println("Are of rectangle: "+ a*b);
	}
}

class Triangle extends Shape1{
	void area(int a, int b) {
		System.out.println("Area of triangle: "+ 0.5f*a*b);
	}
}
public class RunTimePolymorphism {
	
	public static void main(String[] args) {
		
		Shape1 r = new Rectangle();
		r.area(10, 20);
		Shape1 t = new Triangle();
		t.area(10, 20);
		
	}
	
}
