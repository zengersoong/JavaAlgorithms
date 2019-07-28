// Jump Search is an algorithm that jumps in fix steps in-order to potential reduce number of steps in search of the wanted element.
import java.util.Arrays;
import java.util.Collections;
import java.util.*;
class JumpSearch{
        /** @param input an array of integers.
         * @param x The the element inside the list that you are finding.
         * @return The position of the element.
        */
    int jumpSearch(int[] input, int x){
        int n = input.length;
        int stepSize = (int)Math.floor(Math.sqrt(n)); // Step size is best define as a function of the input array.
        int step = 0;// First step initilisation
        while (input[step]< x && step < n ){
            step += stepSize;
            if (step>n){
                // Overshot and exit with -1
                return -1;
            }
        }
        if (input[step]>x){
            // Overshot we need to do linear search starting from previous step. 
            // We can do binary search as well.
            step -= stepSize;
            while (input[step]!= x){
                step ++;
            }
            return step;
        }
        if (input[step] == x ){
            return step;
        }
        return -1;
    }
    public static void main(String[] args) {
        // This algorithm works on sorted array. [ascending in this case.]
        int finding = 9; // 5th position
        int[] arr = {0,2,5,7,8,9,11,21,45,56}; // Ordered unevenly distributed case.
        JumpSearch j = new JumpSearch();
        int result = j.jumpSearch(arr,finding);
        System.out.printf("The number you're seraching for: %d \nResides in index: %d \nArray: %s\n",finding,result,Arrays.toString(arr));
        }
}