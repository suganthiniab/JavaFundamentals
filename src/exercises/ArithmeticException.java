package exercises;

public class ArithmeticException {

    public static void main(String[] args) {

        try {
            int a = 15;
            int b = 15 / 0;
            System.out.println("Output is: " + b);
        } catch (java.lang.ArithmeticException e) {
            System.out.println("Number shouldn't be divided by zero");
        }
    }
}
