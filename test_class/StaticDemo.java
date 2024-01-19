package test_class;

class StaticDemon{
	static int count = 0; // Declare static variables before other variables of the class
	int a = 10;
	
	
	
	public StaticDemon(int a) {
		System.out.println("New class created");
		this.a = a;
		count++;
	}



	static int returnCount() {
		return count;
	}
}

public class StaticDemo {
	
	
	public static void main(String[] args) {  // Main function is static so it can access the static variable that are defined in this class
		
		StaticDemon s1 = new StaticDemon(10);
		System.out.println(StaticDemon.count);
		StaticDemon s2 = new StaticDemon(100);
		System.out.println(StaticDemon.count);
		StaticDemon s3 = new StaticDemon(101);
		System.out.println(StaticDemon.count);
		StaticDemon s4 = new StaticDemon(104);
		System.out.println(StaticDemon.count);
		
	}
}
