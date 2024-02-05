
public class Shape {
	float calculateArea(int a) {
		return a*a;
	}
	float calculateArea(int a, int b) {
		return a*b;
	}
	double calculateArea(int a, int b, int c) {
		double s = (a+b+c)/2f;
		double area = s*(s-a)*(s-b)*(s-c);
		area = Math.pow(area, .5);
		return area;
	}
	float calculateArea(String a, int f) {
		return 3.14f*f*f;
	}
	public static void main(String[] args) {
		Shape s = new Shape();
		System.out.println(s.calculateArea(10));
		System.out.println(s.calculateArea(10, 5));
		System.out.println(s.calculateArea(1, 1, 1));
		System.out.println(s.calculateArea("circle", 10));
	}
}
