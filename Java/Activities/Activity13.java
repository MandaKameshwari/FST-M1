package activities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomScannerActivity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<Integer>();
        Random indexGen = new Random();

        System.out.print("Enter integers please ");
        System.out.println("(EOF or non-integer to terminate): ");

        while (scan.hasNextInt()) {
            List.add(scan.nextInt());
            
        }

        Integer num[] = List.toArray(new Integer[0]);
        int index = indexGen.nextInt(num.length);
        System.out.println("The index value is "+ index);
        System.out.println("The index value generated in array is "+ num[index]);
        scan.close();
    }
}
