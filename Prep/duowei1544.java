import java.util.Scanner;

public class duowei1544 {

	static int[] re;
	
	public static void main(String[] args) {
						
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); scan.nextLine();
		re = new int[n];
		for (int i=0;i<n;i++) {
			re[i] = scan.nextInt();
		}
		scan.close();
						long startTime = System.nanoTime();
		
		System.out.println(recursion10(0, re, 0, 0));
		
						long endTime   = System.nanoTime();
						long totalTime = endTime - startTime;
						System.out.println(totalTime/1000000000);
	} 
	
	public static int recursion10 (int start, int[] arr, int prev, int count) {
		if (start >= arr.length) return count;
		
		if (arr[start] > prev) {
			return recursion10(start+1, arr, arr[start], count+1);
		}
		else if (arr[start] <= prev) {
			return recursion10(start+1, arr, prev, count);
		}
		
		return count;
		
	}

}
