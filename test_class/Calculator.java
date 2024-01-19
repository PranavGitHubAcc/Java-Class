package test_class;

public class Calculator {
	
	private int a;
	private int b;
	
	
	
	public int getA() {
		return a;
	}



	public void setA(int a) {
		this.a = a;
	}



	public int getB() {
		return b;
	}



	public void setB(int b) {
		this.b = b;
	}

	public int add(int a, int b) {
		return (a+b);
	}
	public int subtract(int a, int b) {
		return (a-b);
	}
	public int multiply(int a, int b) {
		return (a*b);
	}
	public float divide(int a, int b) {
		return (a/b);
	}


	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.setA(10);
		calc.setB(100);
		System.out.println("Addition of "+calc.a+" and "+calc.b+" is "+ calc.add(calc.a, calc.b));
		System.out.println("Subtraction of "+calc.a+" and "+calc.b+" is "+ calc.subtract(calc.a, calc.b));
		System.out.println("Multiplication of "+calc.a+" and "+calc.b+" is "+ calc.multiply(calc.a, calc.b));
		System.out.println("Division of "+calc.a+" and "+calc.b+" is "+ calc.divide(calc.a, calc.b));
		
		
	}
}
