//class Student {
//	int rollNo;
//	String name;
//	
//	public Student() {
//		System.out.println("I am no args constructor");
//	}
//	
//	public Student(String name) {
//		this.name = name;
//	}
//	
//	public Student(int rollNo) {
//		this.rollNo = rollNo;
//	}
//	
//	public Student(int rollNo, String name) {
//		// Third Use
////		this();
////		this(11);
//		
//		
//		// First Use
//		// Constructor Chaining
//		this(name);
//		this.rollNo = rollNo;
//	}
//	
//	void displayStudent() {
//		System.out.println("Roll No : " + rollNo);
//		System.out.println("Name : " + name);
//	}
//	
//	void timepassDisplay() {
//		// Second Use
//		this.displayStudent();
////		displayStudent();
//	}
//}
// 
//public class UseOfThisKeyword {
//	public static void main(String[] args) {
//		Student student = new Student(10, "Ravi");
//		student.timepassDisplay();
//		
//		Student student1 = new Student("Sumit");
//		student1.displayStudent();
//		
//		Student student2 = new Student(13, "Raghav");
//		student2.displayStudent();
//	}
//}
