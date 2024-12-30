package string;

public class CompareStrings {
	
	String firstString = "This is test";
	String secondString = "This is demo";
	
	public void testCompareStrings() {
		boolean result;
		result = firstString.equals(secondString);
		System.out.println("Are these strings are same: " + result);
	}

	public static void main(String[] args) {
		CompareStrings obj = new CompareStrings();
		obj.testCompareStrings();
	}

}
