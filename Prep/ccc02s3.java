import java.util.*;
import java.io.*;

/*
* COMMENTS: https://dmoj.ca/problem/ccc02s3
*/

public class ccc02s3 {
	static Deque<Integer> direc = new LinkedList<>(); 
//	static Queue<Integer> direc = new LinkedList<>();
	static Queue<Integer> startQu = new LinkedList<>();
	
	static int[][] floor;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rows = scan.nextInt();
		int cols = scan.nextInt();
		scan.nextLine(); //1≤r≤375;1≤c≤80
		
		System.out.println();
		
		floor = new int[rows+2][cols+2];  // CREATES ARARY AND BORDERS WITH 2
		for (int i=0;i<=rows+1;i++) {floor[i][0] = 2; floor[i][cols+1] = 2;}
		for (int i=0;i<=cols+1;i++) {floor[0][i] = 2; floor[rows+1][i] = 2;}
		
		//take input floor // enqueue all possible starting positions
		for (int row=1; row<=rows; row++) {
			String line = scan.nextLine();
			for (int col=1; col<=cols; col++) {
				char a = line.charAt(col-1);
				if (a == 'X') floor[row][col] = 1;
				if (a == '.') {//floor[row][col] = 0; 
					 startQu.add(row+col*1000);  }
			}
		}
		//enqueue directions
		
		int n = scan.nextInt(); scan.nextLine();
		for (int i=0;i<n;i++) {
			String t = scan.nextLine();
			if (t.charAt(0)=='F') direc.add(0); // 0 go forward
			if (t.charAt(0)=='L') direc.add(-1); // -1 go left
			if (t.charAt(0)=='R') direc.add(1); // 1 go right
		} scan.close();
		
		// running through all possible starting positions
		int s = startQu.size();
 		for (int i=1;i<=s;i++) {
 			int pos = startQu.poll();
 			int row = pos%1000;
			int col = pos/1000;
			
			// run through all the positions while adding them back
//			int r = direc.size();			// V V V original pointing direction
//			travel(row, col, direc, n, 0); // UP
//			travel(row, col, direc, n, 1); // RIGHT
//			travel(row, col, direc, n, 2); // DOWN
			
			System.out.println("row" + row + " col" + col);
			travel(row, col, direc, n, 3); // LEFT
			
			
			//still need to add them back lol
 		}
		
		
		
		//SYSOUT ARRAY FLOOR
	/*	for (int row=0; row<rows+2; row++) {
			for (int col=0; col<cols+2; col++) {
				System.out.print(floor[row][col]);
			}
			System.out.println();
		}*/
		
	/*	System.out.println("q size " + startQu.size());
		while (startQu.isEmpty() == false) {
			int temp = startQu.poll();
			System.out.println("row" + temp%1000);
			System.out.println("col" + temp/1000);
		}*/   // THIS IS HOW YOU DEENCODE

		
		
	}
	
	public static boolean travel (int row, int col, Deque<Integer> qu, int moves, int direc) {
		if (moves == 0 && floor[row][col] == 0) {System.out.println("row" + row + " col" + col);return true;}
		else if ( floor[row][col] == 1 || floor[row][col] == 2) return false;
		else {
			int d = qu.poll(); // take instruction out 
			switch (d) { // process instruction
			case 1: //turn right
				return travel(row, col, qu, moves-1, (direc+1)%4);
			case -1: //turn left
				if (direc==0) return travel(row, col, qu, moves-1, 3);
				else return travel(row, col, qu, moves-1, (direc-1)%4);
			case 0: // move forward
				// 0 up 1 right 2 down 3 left 
				if (direc == 0) { return travel(row-1, col, qu, moves-1, direc);}
				if (direc == 1) { return travel(row, col+1, qu, moves-1, direc);}
				if (direc == 2) { return travel(row+1, col, qu, moves-1, direc);}
				if (direc == 3) { return travel(row, col-1, qu, moves-1, direc);}

			}
			qu.push(d); // reeuqneue
			
			return false; //this should not have to happen
		}
		
	}
	

}



