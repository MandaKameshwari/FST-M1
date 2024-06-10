package activities;

import java.util.Arrays;

public class Activity4 {

    public static void main(String[] args) {
        int [] tempdata = {89,98,20,70,15,12,78,9, 10, 17, 20, 89};
        ascendingSort(tempdata);
        System.out.println("Sorting of the array in ascending order is - ");
        System.out.println(Arrays.toString(tempdata));
    }

    static void ascendingSort(int array[]) {
        int size = array.length, i;
        
        for (i = 1; i < size; i++) {
            int key = array[i];
            int j = i - 1;
            
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = key;
        }
    }
}
