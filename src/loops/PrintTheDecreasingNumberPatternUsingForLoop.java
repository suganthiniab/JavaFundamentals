package loops;

//Print the number pattern: 30, 20, 10, 0 , -10, -20

public class PrintTheDecreasingNumberPatternUsingForLoop {

	public static void main(String[] args) {

		for (int i = 30; i >= -20; i -= 10) {
			System.out.println(i);
		}

	}

}
