package exercises;

import java.util.Scanner;

public class FindSquareRootForUserInput {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;

        System.out.print("Enter your number: ");
        number = in.nextInt();
        System.out.print("Square root of the number: ");
        System.out.println(Math.sqrt(number));

    }
}
