package string;

public class ConcatFunction {
	
	String name = "Java selenium operators and data types";
	String day = "Sunday";
	char space = ' ';
	
	public void testConcatenation() {
		String concatenatedStr = name + space + day;
		System.out.println(concatenatedStr);
	}
	
	public void testConcatMethod() {
		System.out.println(name.concat(day));
	}
	

	public static void main(String[] args) {
		ConcatFunction obj = new ConcatFunction();
		obj.testConcatenation();
		obj.testConcatMethod();
	}

}
