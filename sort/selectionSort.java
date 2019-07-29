// Java implementation of selection Sort
import java.util.Arrays;
import java.util.Collections;
import java.util.*;
// import org.apache.commons.lang3.SerializationUtils; // for deepcopy 
class SelectionSort{
    /**
     * 
     * @param input Unsorted Input array.
     * @return A sorted array from input.
     */
    public static int[] selectionSort(int[] input){
        int n  = input.length;
        for (int i  = 0;i<n; i++){
            int minimum = i;
            for (int j = 0; j<=n-1; j++){
                if (input[j]>input[minimum]){
                    minimum = j;
                }
            // Swap Position between the two arrays.
            int position_lowest = input[minimum];
            input[minimum] = input[i];
            // int[] sortedArray = arr[minimum];
            input[i] = position_lowest;
            }
        }
        return input;
    }
    public static void main(String[] args) {
        // SelectionSort ss = new SelectionSort();
        int[] arr = {32,42,54,1,23,54,32,78,343,23,67,22,12,756,34};
        int[] arrc = {32,42,54,1,23,54,32,78,343,23,67,22,12,756,34}; // without third party just for demo
        // arrc = SerializationUtils.clone(arr); //deepcopy
        int[] sorted = selectionSort(arrc);
        System.out.printf("\nUnsorted Array: %s\nSorted Array (Ascending): %s\n", Arrays.toString(arr), Arrays.toString(sorted));

    }

}