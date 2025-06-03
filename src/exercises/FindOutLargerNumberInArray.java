package exercises;

public class FindOutLargerNumberInArray {

    public static void main(String[] args) {

        int[] numberList = {5, 7, 4, 8};
        int largeNumber = numberList[0];

        for(int i=0; i<numberList.length; i++){
            if(largeNumber < numberList[i]){
                largeNumber = numberList[i];
            }
        }
        System.out.println("Larger Number is: " + largeNumber);
    }
}
