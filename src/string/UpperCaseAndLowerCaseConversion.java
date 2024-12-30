package string;

public class UpperCaseAndLowerCaseConversion {
	
	String training1  = "selenium java advanced course";
	String training2 = "SELENIUM JAVA ADVANCED COURSE";
	
	public void testUpperAndLowerCaseConversion() {
		System.out.println("After converting to upper case: " + training1.toUpperCase());
		System.out.println("After converting to lower case: " + training2.toLowerCase());
	}	

	public static void main(String[] args) {
		UpperCaseAndLowerCaseConversion obj = new UpperCaseAndLowerCaseConversion();
		obj.testUpperAndLowerCaseConversion();		
	}
}
