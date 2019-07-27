// Java implementation of iterative Binary Search 
package SA;
public class BinarySearch { 
	public int binarySearch(int arr[], int l ,int r,int x) 
	{ 
		// int l = 0, r = arr.length - 1; 
		while (l <= r) { 
			int m = l + (r - l) / 2; 

			// if x is in the middle or found.
			if (arr[m] == x) 
				return m; 

			// X is larger, we only care about the right split 
			if (arr[m] < x) 
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
	// 	int arr[] = { 1,2,3,4,5,6,7,8}; 
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
