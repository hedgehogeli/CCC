import java.util.*;
import java.io.*;

/*
* COMMENTS: https://dmoj.ca/problem/ccc10s3
*/

public class ccc10s3 {

	static Map<Integer, String> map = new HashMap<>();
	
	public static void main(String[] args) throws Exception {
		
	/* a1 a2 a3 ... a9
	 * b1 b2 ...
	 * ...
	 * j1 j2 j3 ... j9
	 */
		

		BufferedReader mReader = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = new String[9]; //index 0
		int[][] floor = new int[9+1][10+1]; //index1
		
		
		
		// A=65, J=74
		
		for (int row=65; row<=74; row++) {
			input = mReader.readLine().split(" ");
			for (int col=1; col<=9; col++) {
				map.put(row*100+col,input[col-1]);
				try {
					floor[col][row-64] = Integer.parseInt(input[col-1]);
				}
				catch (Exception E) {
					floor[col][row-64]=-1;
				}
			}
		} // sticking shit into map and initial floor values
		mReader.close();
		
		for (int row=65; row<=74; row++) {
			for (int col=1; col<=9; col++) {
				// key = row*100+col
				
				if (floor[col][row-64]==-1) { //if there was a string
					fill(row*100+col);
				}
				
			}
		}
		
		//OUTPUT
		for (int row=1; row<=10; row++) {
			for (int col=1; col<=9; col++) {
				System.out.print(floor[col][row] + " ");
			}
			System.out.println();
		}
		
	//	for (char row=65; row<=74; row++) {
	//		char a = row;
	//		for (int col=1; col<=9; col++) {
				
	///			System.out.print(a + "" + col + " ");
	//		}
		//	System.out.println();
	///		}
		
		
/*
		for (int row=1; row<=10; row++) {
			input = mReader.readLine().split(" ");
			for (int col=1; col<=9; col++) {
				
				try { // if convert to int is fine
				floor[col][row] = Integer.parseInt(input[col-1]);
				}
				catch (Exception E) {
					
				}
				
			}
		}
		
		
		for (int row=1; row<=10; row++) {
			for (int col=1; col<=9; col++) {
				System.out.print(floor[col][row] + " ");
			}
			System.out.println();
		}
		
		*/
		
		

	}
	
	public static void fill(int spot) {
		String mappedVal = map.get(spot);
		
		
	}
	

}



