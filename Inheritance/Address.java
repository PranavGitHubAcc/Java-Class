
public class Address {
	String addressLine1;
	String addressLine2;
	int pinCode;
	
	public Address(String addressLine1, String addressLine2, int pinCode) {
		super();
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Address [addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", pinCode=" + pinCode
				+ "]";
	}
	
}
