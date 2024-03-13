
class BhoiPickUp extends Exception{
	public BhoiPickUp(String messaegString){
		super(messaegString);
	}
}



public class SampleMain {
	static void bhoi(String gendString) throws BhoiPickUp{
		if(gendString == "M") {
			throw new BhoiPickUp("Ladka hai. Mai nahi jara");
		}else {
			System.out.println("Chalo takatak");
		}
	}
	public static void main(String[] args) {
		try {
			bhoi("f");
		} catch (BhoiPickUp e) {
			// TODO: handle exception
			System.err.println(e);
			
		}finally {
			System.out.println("hello");
		}
	}
}
