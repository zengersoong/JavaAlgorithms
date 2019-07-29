// Java implementation of Bubble Sort
// The simplest sorting algorithm that works by swapping adjacent elements if they are in the wrong order.

import java.util.Arrays;
import java.util.Collections;
import java.util.*;
// import org.apache.commons.lang3.SerializationUtils; // for deepcopy

class BubbleSort{
        /**
     * 
     * @param input Unsorted Input array.
     * @return A sorted array from input.
     */
    public static int[] bubbleSort(int[] input){
        int n = input.length;
        // for each pass, we swap adjacent elements one round.
        for (int pass = 0; pass <n-1-pass; pass++){
            for (int j = 0; j < n-1;j++){
                if (input[j]>input[j+1]){
                    int higher = input[j]; //auxilliary space used higher
                    input[j] = input[j+1];
                    input[j+1] = higher;
                }
            }
        }
        return input;
    }
    public static void main(String[] args) {
        int[] arr = {32,42,54,1,23,54,32,78,343,23,67,22,12,756,34};
        int[] arrc = {32,42,54,1,23,54,32,78,343,23,67,22,12,756,34}; // without third party just for demo
        // arrc = SerializationUtils.clone(arr); //deepcopy
        int[] sorted = bubbleSort(arrc);
        System.out.printf("\nUnsorted Array: %s\nSorted Array (Ascending): %s\n", Arrays.toString(arr), Arrays.toString(sorted));
    }
}