import java.util.*;
import java.io.*;

/*
* COMMENTS:
* https://www.hackerearth.com/practice/algorithms/searching/binary-search/practice-problems/algorithm/min-sum/
* 
* brute force is way too slow
* 
* sort array, 
* prefix sum, 
* binary search, 
* output
* 
* NOT DONE
*/

public class HEminsum {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//take input arr
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i=0;i<n;i++) {
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr);
		
		//prefix sum
		long[] preSum = new long[n];
		preSum[0] = arr[0];
		for (int i=1; i<n; i++) {
			preSum[i] = preSum[i-1] + arr[i];
		}
		
		
		int q = scan.nextInt();
		int low = 0; int high = n;  //index 0
		for (int i=0; i<q; i++) {
			int x = scan.nextInt(); // key
			
			//feed index found into checkdup
			int finalindex = checkDup (arr, binarySearch(arr, low, high, x-1));
			
			System.out.println(preSum[finalindex]);
		} 	
		
	}
	
	public static int checkDup(int[] arr, int index) {
		if (index<arr.length-1) {
			if (arr[index]==arr[index+1]) {
				return checkDup(arr, index+1);
			}
		}
		
		return index;
	}
	
	public static int binarySearch(int[] arr, int l, int r, int x) { 
		int mid = 0;
        if (r >= l) { 
            mid = l + (r - l) / 2; 
            
            if (arr[mid] == x) 
                return mid; 
  
            // If element is smaller than mid, then 
            // it can only be present in left subarray 
            if (arr[mid] > x) 
                return binarySearch(arr, l, mid - 1, x); 
  
            // Else the element can only be present 
            // in right subarray 
            return binarySearch(arr, mid + 1, r, x); 
        } 
        
        // key -1 
        return binarySearch(arr,0,arr.length-1,x-1); 
    } 
	/*
	public static int bonkbinarySearch(int[] arr, int low, int high, int x) {
		int mid = 0;
		while (low<=high) {
			mid = (low+high)/2; 
			if (x<arr[mid]) { // if in first half      //PROBLEM HERE INDEXOUTOFBOUNDS
				high = mid-1;
			}
			else if (x>arr[mid]) { // if second half
				low = mid+1;
			}
			else {
				return (mid);
			}
		}
		return mid-1;
	}
	*/

}



