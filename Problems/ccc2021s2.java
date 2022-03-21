import java.util.*;
import java.io.*;

/*
* COMMENTS:
*/

public class ccc2021s2 {

	public static void main(String[] args) throws Exception {
		
		//generate map
		//      row#			col#		state
	//	HashMap<Integer, HashMap<Integer, Integer>> grid = new HashMap<>(); 
		
		BufferedReader mReader = new BufferedReader(new InputStreamReader(System.in));
		int rows = Integer.valueOf(mReader.readLine());
		int cols = Integer.valueOf(mReader.readLine());
		int K = Integer.valueOf(mReader.readLine());
		
		//filling map
		//for (int r=1; r<=rows; r++) {
		//	
	//	}
		
		//array creation, autofilled 0
		int[][] array = new int[rows][cols];
		
		//input processing
		HashMap<String, Integer> orders = new HashMap<>();
		Set<String> set = new HashSet<String>(); 
		
		for (int i=0; i<K; i++) {
			String input = mReader.readLine();
			set.add(input);
			if (orders.containsKey(input) == false) {
				orders.put(input, 1);
			}
			else {
			orders.put(input, orders.get(input)+1);
			}
			
		}
		
		for (String oper : set) {
			if (orders.get(oper)%2==0) { //dont do it
				continue;
			}
			
			else { //must be equivalent to once
				
				int num = Integer.valueOf(oper.substring(2))-1;
				
				if (oper.charAt(0)=='R') {
					for (int j=0; j<cols; j++) {
						if (array[num][j] == 1) {array[num][j] = 0;}
						else {array[num][j] = 1;}

					}
				}
				
				if (oper.charAt(0)=='C') {
					for (int k=0; k<rows; k++) {
						if (array[k][num] == 1) {array[k][num] = 0;}
						else {array[k][num] = 1;}
					}
				}
				
			}
			
		}
		
		
		int gold = 0;
		
		for (int r=0; r<rows; r++) {
			for (int c=0; c<cols; c++) {
				if (array[r][c]==1) gold = gold +1;
			}
		}
		
		System.out.println(gold);

		
		

	}

}



