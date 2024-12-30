package datatype;

public class DivideDecimalNumbers {
	
	float firstDecimalNum = 13.6f;
	float secondDecimalNum = 2.4f;
	
	public float divide() {
		float result = 0.0f;
		result = firstDecimalNum / secondDecimalNum ;
		return result;					
	}

	public static void main(String[] args) {
		DivideDecimalNumbers obj = new DivideDecimalNumbers();
		System.out.println("Division: " +  obj.divide());

	}

}
