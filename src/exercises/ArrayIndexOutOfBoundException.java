package exercises;

/*
Create a class ArrayIndexOutOfBounds with a method main
The main method should contain try and catch block
The try block should contain the program and catch block should contain the output of exception
Output: Array Index Out Of Bound
 */

public class ArrayIndexOutOfBoundException {

    public static void main(String[] args) {
        try {
            int[] numberList = {10, 12, 14, 16, 18};
            System.out.println(numberList[5]);
        }
        catch (Exception e) {
            System.out.println("Array Index Out Of Bound");;
        }
    }
}
