package exercises;
/*
Write a program to Pass Array to Method and add all array integers to get the total sum
Create 2 methods
1. A method to add sum
2. main method to pass the array
Input: 10, 17, 27
Output: 54
 */

public class FindoutTotalUsingArray {

    public void findoutSum(int[] numbers){

        int total = 0;
        for(int i = 0; i < numbers.length; i++){
            total = total + numbers[i];
        }
        System.out.println("Total is: " + total);
    }

    public static void main(String[] args) {
        FindoutTotalUsingArray fTotalUsingArray = new FindoutTotalUsingArray();
        fTotalUsingArray.findoutSum(new int[]{10, 17, 27});
    }
}
