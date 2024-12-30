package loops;

public class FindSumOfMarksUsingWhileLoop {

	public static void main(String[] args) {

		int[] marks = { 56, 67, 90, 87, 65, 86, 77, 94, 82, 92 };

		int i = 0;
		int sum = 0;

		while (i < marks.length) {
			sum += marks[i];
			i++;
		}

		System.out.println("Sum of marks: " + sum);

	}
}
