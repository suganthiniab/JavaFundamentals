package array;

public class FindLargerNumberInAnArray {
	int[] numbers = {5, 7, 4, 8};
	int max = 0;
	
	public void testFindLargerNumber() {
		
		for(int i : numbers) {
			if(i>max) 
			{max=i;
			}
		}
		System.out.println("Larger Number in teh array is:" +"\t" + max);
	}

	
	public static void main(String[] args) {
		FindLargerNumberInAnArray obj = new FindLargerNumberInAnArray();
		obj.testFindLargerNumber();
	}
}
