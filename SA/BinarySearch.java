// Java implementation of iterative Binary Search 
package SA;
public class BinarySearch {
		/** @param input an array of integers.
		 * @param l The lower bound of the array you're searching from.
		 * @param r The upper bound of the array you're searching to.
         * @param x The the element inside the list that you are finding.
         * @return The position of the element.
        */
	public int binarySearch(int[] input, int l ,int r,int x) 
	{ 
		while (l <= r) { 
			int m = l + (r - l) / 2; 

			// if x is in the middle or found.
			if (input[m] == x) 
				return m; 

			// X is larger, we only care about the right split 
			if (input[m] < x) 
				l = m + 1; 

			// X is smaller, we only care about the left split 
			else
				r = m - 1; 
		} 
		// if element do not exist in the array
		return -1; 
	} 

	// public static void main(String args[]) 
	// { 
	// 	BinarySearch bs = new BinarySearch(); 
	// 	int[] arr = { 1,2,3,4,5,6,7,8}; 
	// 	int n = arr.length; 
	// 	int x = 10; 
	// 	int result = bs.binarySearch(arr, x); 
	// 	if (result == -1) 
	// 		System.out.println("Element not present"); 
	// 	else
	// 		System.out.println("Element found at "
	// 						+ "index " + result); 
	// } 
} 
