package activities;

import java.util.Arrays;

public class Activity2 {

    public static void main(String[] args) {
        // creating a main method to initialize and array with 6 numbers
        int[] numArr = {10, 77, 10, 54, -11, 10};
        System.out.println("Original Array - " + Arrays.toString(numArr));
        // setting constant value 
        int searchNum = 10;
        int fixedSum = 30;

        // print the result 
        System.out.println("Result - "+result(numArr, searchNum, fixedSum));

    }
    public static boolean result(int[] numbers, int searchNum, int fixedSum) {
        int temperarySum = 0;
        // Initialize a loop

        for(int number : numbers) {
            // if value is 10
            if (number == searchNum) {
                temperarySum = temperarySum+searchNum;
                
            }
            // if sum is more than 30
            if (temperarySum>fixedSum){
                break;
            }

            // if condition satisfies then returning the temproray number

            
        }

        return temperarySum == fixedSum;
    }

}
