// import java.util.Arrays;
import java.util.Arrays;
import java.util.Collections;
import org.graalvm.compiler.graph.spi.Canonicalizable.Binary;
// import BinarySearch.java;
import java.util.*;
import SA.*;
class ExponentialSearch{
    int exponentialSearch(int[] input,int x){
        int ans = 0;
        Arrays.sort(input);
        int count = input.length;
        System.out.println("Sorted Array = "+Arrays.toString(input)+"\nLength of array:"+Integer.toString(count));
        return ans;
        BinarySearch bs = new BinarySearch();
        int resultBS = bs.binarySearch(input, x);

    }



public static void main(String[] args) {
    int[] arr = {55,15,25,50};
    ExponentialSearch x = new ExponentialSearch();
    int result = x.exponentialSearch(arr,1);
    System.out.println(result);
    }
}