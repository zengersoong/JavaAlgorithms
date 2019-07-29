# JavaAlgorithms
## Search Algorithms

### 1. Binary Search
Divide and Conquer Approach
Time Complexity : O(1) or average case O(Logn)
### 2. Exponential(Doubling) Search (imports BinarySearch)
Divide and Conquer Approach
Time Complexity : O(1) or average case O(Logn)
### 3. Jump Search  
Jump k-steps where k is sqrt(array.length), speed up version of linear search.  
Time Complexity : between Linear Search ( ( O(n) ) and Binary Search ( O (Log n) )
### 4. Interpolation Search (imports BinarySearch)  
Works best with Uniformly distributed array.
Time Complexity :  Best case : O (log log n)),  Worst case : T((n/m) + m-1)
Auxillary Space : O(1)

## Sorting Algorithms

### 1. Selection Sort  
Repeatedly find the minimum element from unsorted part and putting it at the beginning  
Time Complexity :best O(n) , average O(n^2), Worst O(n^2)  
Auxillary Space : O(1)
### 2. Insertion Sort   
Sort by inserting the next element in iteration based on its value to the back, else hold its position if its the highest.
Time Complexity :best O(n) , average O(n^2), Worst O(n^2)  
Auxillary Space : O(1)
### 3. Bubble Sort  
Compare adjacent element and swap places based on which is higher valued/lower valued  
Time Complexity :best O(n) , average O(n^2), Worst O(n^2)  
Auxillary Space : O(1)
### 4. Merge Sort
Divide and Conquer Approach  
Recursively divide input array into two halves, and then compare call merge function which compares the elements of the two halfs picking the lower value/higher value element into the merged array   
Time Complexity : O(n * log(n))  
The input halved O(log(n)) times) while N elements iterated log(n) times, giving nlogn  
Auxillary Space : O(1)



