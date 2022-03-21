import java.util.*;
import java.io.*;

/*
* COMMENTS:
*/

public class CCC2020s2 {

	static boolean[][] visited;
	static Queue<Integer> qu = new LinkedList<>();
	static int rows, cols;
	static int[][] floor;
	
	public static void main(String[] args) throws NumberFormatException, Exception {
		
//		System.out.println(genFactors(10));
		
		BufferedReader mReader = new BufferedReader(new InputStreamReader(System.in));
		rows = Integer.parseInt(mReader.readLine());
		cols = Integer.parseInt(mReader.readLine());
		
		visited = new boolean[rows+1][cols+1];
		floor = new int[rows+1][cols+1];
		
		for (int row=1; row<=rows; row++) { // going down
			String[] inputArray = mReader.readLine().split(" ");
			for (int col = 1; col<=cols; col++) { // L to R
				floor[row][col] =Integer.parseInt(inputArray[col-1]);
			}
		}
		mReader.close();
		
		recurse(1,1);
		
		if (!visited[rows][cols]) System.out.println("no");
		else System.out.println("yes");
		
	/*	for (int row=0; row<=rows; row++) { // going down
			for (int col = 0; col<=cols; col++) { // L to R
				System.out.print(floor[row][col] + " ");
			}
			System.out.println();
		} */
		
		
	}
	
	public static void recurse(int r, int c) {
		visited[r][c] = true;
//		if (r==rows && c == cols) {
//			System.out.println("yes");
//		}
		int val = floor[r][c];
		for (int i : genFactors(val)) {
			int a = i; int b = val/i;
			
			if (a<=rows && b<=cols) { // so no index out of bounds
			if (visited[a][b]==false) {
				visited[a][b] = true;
				recurse(a,b);
			}
			}
		}
		
		
	}
	
	
	public static LinkedList<Integer> genFactors (int input) {
		LinkedList<Integer> output = new LinkedList<>();
		
		for (int i=1; i<Math.sqrt(input)+1; i++) {
			if (input%i==0) {
				output.add(i);
				output.add(input/i);
			}
		}
		
		return output;
	}

}
