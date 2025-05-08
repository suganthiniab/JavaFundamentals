package exercises;

import java.text.NumberFormat;
import java.util.Scanner;

public class UserInputAndCurrency {

    public static void main(String[] args) {

        double number;

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the amount to be formatted as currency: ");
        number = in.nextDouble();

        if (number > 0) {
            System.out.print("The number formatted as currency is: ");
        } else {
            System.out.print("Please enter valid number: ");
            number = in.nextDouble();

            if (number > 0) {
                System.out.println("The number formatted as currency is: ");
            } else {
                System.out.println("Invalid number");
                return;
            }
        }
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        System.out.println(fmt.format(number));
    }
}

