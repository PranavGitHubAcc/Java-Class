
public class HasA {
	String name;
	int empId;
	
	Address address; // Composition. Another class is used as a data type

	public HasA(String name, int empId, Address address) {
		super();
		this.name = name;
		this.empId = empId;
		this.address = address;
	}
	
	public static void main(String[] args) {
		Address a = new Address("al1", "al2", 411045);
		HasA employee = new HasA("Ravi", 1, a);
		//or
		HasA employee2 = new HasA("Ravi", 1, new Address("al1", "al2", 411045));
		System.out.println(a);
	}
	
}
