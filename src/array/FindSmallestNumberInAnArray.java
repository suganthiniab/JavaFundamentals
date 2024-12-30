package array;

public class FindSmallestNumberInAnArray {

	int[] numbers = {5, 7, 4, 8};
	
	public void testFindingSmallestNumber() {
		int min = numbers[0];
		for(int i : numbers) {
			if(i<min) {
				min = i;
			}
		}
		System.out.println("Miminum number in the array: " + min);
	}
	
	
	public static void main(String[] args) {
		
		FindSmallestNumberInAnArray obj = new FindSmallestNumberInAnArray();
		obj.testFindingSmallestNumber();
	}
}
