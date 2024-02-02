class Student{
	int PRN = 1000;
	
	void displayPrice(){
		System.out.println("PRN: "+PRN);
	}
}

class SecondYear extends Student{
	boolean specialization = false;
	
	void displaySY() {
		System.out.println("Second year students " +(specialization?"have":"do not have")+" specialization.");
	}
}

class ThirdYear extends Student{
	boolean specialization = true;
	
	void displayTY() {
		System.out.println("Third year students " +(specialization?"have":"do not have")+" specialization.");
	}
}

public class InheritanceHier {
	public static void main(String[] args) {
		SecondYear sy = new SecondYear();
		ThirdYear ty = new ThirdYear();
		sy.displaySY();
		ty.displayTY();
	}
	
}
