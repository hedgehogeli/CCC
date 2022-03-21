import java.util.*;
import java.io.*;

/*
* COMMENTS: https://www.hackerearth.com/practice/algorithms/graphs/depth-first-search/practice-problems/algorithm/words-and-trees-f9ef202c/
*/

public class HEwordsandtrees {

	public static void main(String[] args) throws Exception {
		BufferedReader mReader = new BufferedReader(new InputStreamReader(System.in));
		String[] input = mReader.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		int q = Integer.parseInt(input[1]);
		
		input = mReader.readLine().split(" ");
		char[] c = new char[n+1];
		for (int i=1; i<=n; i++) {
			c[i] = input[i-1].charAt(0);
		}
		
		for (int i=0; i<n-1; i++) { //n-1 edges b/c rooted tree
			
		}
		
		//use set to contain, and use array - dfs only used to collect information
		
	}

}



