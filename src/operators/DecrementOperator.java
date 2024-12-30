package operators;

public class DecrementOperator {
	
	int x = 15;
	int y = 20;
	
	public int testDecrementOperator() {
		x--;		
		return x;		
	}
	
	public int testCompoundOperator() {
		y-=1;
		return y;
	}

	public static void main(String[] args) {
		DecrementOperator obj = new DecrementOperator();
		System.out.println("After Decrement: " + obj.testDecrementOperator());
		System.out.println("After Decrement: " + obj.testCompoundOperator());
	}

}
