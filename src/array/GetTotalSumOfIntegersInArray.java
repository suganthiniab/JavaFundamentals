package array;

public class GetTotalSumOfIntegersInArray {
	
	int[] numbers = {2, 4, 6};
	int sum = 0;
	
	public void testGetTotalSum() {
		
		for(int i : numbers) {
			sum+=i;
			}
		System.out.println("Total sum:" + "\t" + sum);		
	}

	public static void main(String[] args) {
		GetTotalSumOfIntegersInArray obj = new GetTotalSumOfIntegersInArray();
		obj.testGetTotalSum();		
	}

}
