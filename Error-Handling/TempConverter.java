import java.util.Scanner;

class TemperatureException extends Exception{
	public TemperatureException(String message){
		super(message);
	}
}

public class TempConverter {
	
	static void checkTemp(float f) throws TemperatureException {
		
		float inKelvin = f + 273.15f;
		if (inKelvin<0) {
			throw new TemperatureException("Temperature is too low.");
		} else {
			System.out.println("Temp in kelvin: "+inKelvin);
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter temperature in Celcius ");
		float f = scanner.nextFloat();
		try {
			checkTemp(f);
		} catch (TemperatureException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
