// Java implementation of selection Sort
import java.util.Arrays;
import java.util.Collections;
import java.util.*;
// import org.apache.commons.lang3.SerializationUtils; // for deepcopy
class InsertionSort{
        /**
     * 
     * @param input Unsorted Input array.
     * @return A sorted array from input.
     */
    public static int[] insertionSort(int[] input){
        int n = input.length;
        for (int i=0; i< n; i++){
            int current = input[i];
            int previous = i-1;
            while (previous >= 0 && current < input[previous] ){ // not the first element index at 0, and the current is less.
                input[previous+1] = input[previous]; // push them up by 1 step
                previous -- ; // move down by one
            }
            input[previous+1] = current;
        }
        return input;
    }
    public static void main(String[] args) {
        int[] arr = {32,42,54,1,23,54,32,78,343,23,67,22,12,756,34};
        int[] arrc = {32,42,54,1,23,54,32,78,343,23,67,22,12,756,34}; // without third party just for demo
        // arrc = SerializationUtils.clone(arr); //deepcopy
        int[] sorted = insertionSort(arrc);
        System.out.printf("\nUnsorted Array: %s\nSorted Array (Ascending): %s\n", Arrays.toString(arr), Arrays.toString(sorted));
    }
}