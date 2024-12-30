package array;

public class PrintAllElementsInTheArray {
	
	int[] numbers = {10, 20, 30};
	String[] values = {"IT" , "Training", "Institute"};
	
	public void testPrintArrayOfIntegers() {
		System.out.println("===========Print all the numbers in the integer array==============");
		
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
	
	public void testPrintArrayOfStrings() {
		System.out.println("===========Print all the values in the String array==============");
		for(String i: values) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		PrintAllElementsInTheArray obj = new PrintAllElementsInTheArray();
		obj.testPrintArrayOfIntegers();
		obj.testPrintArrayOfStrings();
	}
}
