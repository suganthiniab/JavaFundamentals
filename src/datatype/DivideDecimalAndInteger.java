package datatype;

public class DivideDecimalAndInteger {
	
	
	double firstNumber = 12.4;
	int secondNumber = 4;
	
	public double divideDecimalByInteger() {
		int result1 = 0;
		result1 = firstNumber/secondNumber;
		return result1;		
	}
	
	public double divideIntegerByDecimal() {
		double result2 = 0;
		result2 = secondNumber/firstNumber;
		return result2;
	}
		

	public static void main(String[] args) {
		DivideDecimalAndInteger obj = new DivideDecimalAndInteger();		
		System.out.println(obj.divideDecimalByInteger());
		System.out.println(obj.divideIntegerByDecimal());
		
		}
		
}
