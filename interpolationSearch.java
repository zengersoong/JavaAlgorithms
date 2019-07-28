// InterpolationSearch is better than that of Binary Search Algorithm when the values within a array/list is uniformly distributed.
// Since with a uniformly distributed ordered array, we can move closer to the element we are finding rather than just using the middle element
import java.util.Arrays;
import java.util.Collections;
import java.util.*;
import SA.*;
class InterpolationSearch{
    int interpolationSearch(int[] input, int x){
        int firstIndex = 0;
        int lastIndex = input.length-1;
        int valFirstIndex = input[firstIndex];
        int valLastIndex = input[lastIndex];
        // For Uniformly distributed ordered list, this should work. Time complexity O(1).
        int index = firstIndex + ( (x-valFirstIndex)*(lastIndex-firstIndex) / (valLastIndex-valFirstIndex) );
        // Start search now...
        BinarySearch bs = new BinarySearch();
        System.out.println((index)+"here");
        while(input[index] != x){
            if (input[index] > x){
                // The value must be from the left array. 
                //Do binary search on the left side of the array.
                System.out.println("Left-Search");
                index = bs.binarySearch(input,firstIndex,index-1,x);

                return index;
            }
            if (input[index] < x){
                // The value must be from the right array.
                //Do binary search on the right side of the arrqay.
                System.out.println("r=Right-Search");
                System.out.println(index+"here"+(lastIndex));
                index = bs.binarySearch(input,index+1,lastIndex,x);
                return index;
                
        }
    }
    return index;
    }
public static void main(String[] args) {
        // This algorithm works on sorted array. [ascending in this case.]
        int finding = 11; //Pos is 5
        int[] arr = {1,3,5,7,9,11,13,15,17,19,21,23};// do not have to be uniformly distributed, but it would be perform way better than binarySearch.
        // int[] arr = {1,3,5,10,11,17,19,21,25,29,31}; // This is not uniformly distributed.
        InterpolationSearch s = new InterpolationSearch();
        int result = s.interpolationSearch(arr,finding);    
        System.out.printf("The number you're seraching for: %d \nResides in index: %d \nArray: %s\n",finding,result,Arrays.toString(arr));
        }
}
