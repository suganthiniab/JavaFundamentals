package operators;

public class IncrementOperator {
	
	int a = 10;
	int b = 20;
	
	public int testIncrementOperator() {
		a++;
		return a;
	}
	
	public int testCompoundOperators() {
		b+=1;
		return b;
	}

	public static void main(String[] args) {
		IncrementOperator obj = new IncrementOperator();
		System.out.println("After Increment: "+ obj.testIncrementOperator());
		System.out.println("After Increment: " + obj.testCompoundOperators());
	}

}
