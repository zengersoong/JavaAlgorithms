// Java implementation of Merge Sort
import java.util.Arrays;
import java.util.Collections;
import java.util.*;
// import org.apache.commons.lang3.SerializationUtils; // for deepcopy
class MergeSort{
        /**
     * 
     * @param input Unsorted Input array.
     * @return A sorted array from input.
     */
    public static Comparable[] mergeSort(Comparable[] list)
    {
        //Empty List or broken down to smallest size avail.
        if (list.length <= 1) {
            return list;
        }
        Comparable[] first = new Comparable[list.length / 2];
        Comparable[] second = new Comparable[list.length - first.length];
        // Object source_arr, int sourcePos, Object dest_arr, int destPos, int len
        System.arraycopy(list, 0, first, 0, first.length);// Copy List to first 
        System.arraycopy(list, first.length, second, 0, second.length);
        //Sort recursively
        mergeSort(first);
        mergeSort(second);
        //Merge both halves together, overwriting to original array
        merge(first, second, list);
        return list;
    }
    @SuppressWarnings({ "rawtypes", "unchecked" })
    private static void merge(Comparable[] first, Comparable[] second, Comparable[] merged)
    {
        int index1 = 0;
        int index2 = 0;
        int indexMerged = 0;
        //Compare elements and pick the smaller one to combined
        while (index1 < first.length && index2 < second.length)
        {
            System.out.println((first[index1])+" "+(second[index2]));
            if (first[index1].compareTo(second[index2]) < 0) // if first[index] is smaller than second[index]
            {
                merged[indexMerged] = first[index1];
                index1++;
            }
            else
            {
                merged[indexMerged] = second[index2];
                index2++;
            }
            indexMerged++;
        }
        //Remaining elements needed to be copied in.
        System.arraycopy(first, index1, merged, indexMerged, first.length - index1);
        System.arraycopy(second, index2, merged, indexMerged, second.length - index2);
    }
    public static void main(String[] args)
    {
        Integer[] arr = {32,42,54,1,23,54,32,78,343,23,67,22,12,756,34};
        Comparable[] arrc = {32,42,54,1,23,54,32,78,343,23,67,22,12,756,34}; // without third party just for demo
        Comparable[] sorted = mergeSort(arrc);
        System.out.printf("\nUnsorted Array: %s\nSorted Array (Ascending): %s\n", Arrays.toString(arr), Arrays.toString(sorted));
    }
}