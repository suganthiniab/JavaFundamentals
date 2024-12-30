package string;

public class CompareStringsByCase {
	
	String course1 = "Java Selenium Course";
	String course2 = "java selenium course";

	public void testCompareStringsByCase() {
		boolean result;
		result = course1.equalsIgnoreCase(course2);
		System.out.println("Are the Strings are same:" + "\t" + result);		
	}
	
	public static void main(String[] args) {
		CompareStringsByCase obj = new CompareStringsByCase();
		obj.testCompareStringsByCase();	
	}
}
