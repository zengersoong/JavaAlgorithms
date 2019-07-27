import java.util.Arrays;
import java.util.Collections;
import java.util.*;
import SA.*; // Import Custom Algorithms
class ExponentialSearch{
    int exponentialSearch(int[] input,int x){
        int ans = 0;
        int n = input.length;
        if (input[0]==x) {
            return 0;
        }
        // Go to the next index and double from there until it is found.
        int i = 1;
        // escape if [1] i exeeds the array index or is within that range.
        while (i < n && input[i]<=x){
            i  = i*2;
        }
        // call binary search from the package 
        BinarySearch bs = new BinarySearch();
        // divide by 2 here as i would have overshoot x in index, or the input array.
        int resultBS = bs.binarySearch(input,i/2,Math.min(i,n),x);
        return resultBS;
    }

public static void main(String[] args) {
    // This algorithm works on sorted array. [ascending in this case.]
    int finding = 2;
    int[] arr = {0,2,5,7,8,9,11,21,45,56};
    ExponentialSearch x = new ExponentialSearch();
    int result = x.exponentialSearch(arr,finding);
    System.out.printf("The number you're seraching for: %d \nResides in index: %d \nArray: %s\n",finding,result,Arrays.toString(arr));
    }
}
