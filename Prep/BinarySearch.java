import java.util.*;
import java.io.*;

/*
* COMMENTS:
*/

public class BinarySearch {

	public static void main(String[] args) {
		
		
		int size = ;
		int[] arr = new int[size];
		Arrays.sort(arr);
		
		int x = ; // key
		
		
		int low = 0; int high = size-1; //index 0
		
		binarySearch(arr, low, high, x);
		
	}
	
	public static int binarySearch(int arr[], int min, int max, int x) 
    { 
        if (max >= min) { 
            int mid = (min+max)/2; 
            
            if (arr[mid] == x) return mid;  
            else if (arr[mid] > x) return binarySearch(arr, min, mid - 1, x); 
            else return binarySearch(arr, mid + 1, max, x); 
        } 
        return -1; 
    } 
	
	/*
	public static int binarySearch (int[] arr, int low, int high, int x) {
		while (low<=high) {
			int mid = (low+high)/2;
			if (x<arr[mid]) { // if in first half
				high = mid-1;
			}
			else if (x>arr[mid]) { // if second half
				low = mid+1;
			}
			else {
				return(mid+1); //index 1 output
			}
		}
		return -1;
	}
	*/
	
}
