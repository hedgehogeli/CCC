import java.util.Scanner;

public class duowei1147 {
	
	static int[][] re;
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); scan.nextLine();
		
		re = new int[n][n];
		
		int[][] ar = new int[n][n];
		
		for(int row = 0; row<n; row++) {
			for (int col = 0; col<row+1; col++) {
				ar[row][col] = scan.nextInt();
			}
		}
		scan.close();
		
		System.out.println(findMax(ar, 0, 0, n));
		
	}
	
	public static int findMax(int[][] arr, int row, int col, int n) {
		if (row==n-1) return arr[row][col];
		int a = findMax(arr,row+1, col, n);
		int b = findMax(arr, row+1, col+1, n);
		if (a>b) return a+arr[row][col];
		else return b+arr[row][col];
	}

}
