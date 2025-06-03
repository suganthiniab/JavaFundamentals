package exercises;

public class FindOutSmallestNumberInArray {

    public static void main(String[] args) {

        int[] numberList = {5, 7, 4, 8};
        int smallestNumber = numberList[0];

        for (int i=0; i < numberList.length; i++){
            if(numberList[i] < smallestNumber){
                smallestNumber = numberList[i];
            }
        }

        System.out.println("Smallest Number: " + smallestNumber);
    }
}
