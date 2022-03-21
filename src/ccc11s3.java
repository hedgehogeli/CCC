import java.util.*;
import java.io.*;

/*
* COMMENTS: recursion
* im so stoopid
* figure it out u dumbfuck
*/

public class ccc11s3 {

	static int[][] empty = new int[5][5];
	static int[][] full = new int[5][5];
	static int[][] triangle = new int[5][5];
	static HashMap<Integer, int[][]> map = new HashMap<>(); 
	
//	static int[][] base;
	
	public static void main(String[] args) {
		Arrays.fill(empty, 0);
		Arrays.fill(full, 1);
		Arrays.fill(triangle, 0); triangle[1][0]=1;triangle[2][0]=1;triangle[3][0]=1;triangle[2][1]=1;
		
		int[][] base = new int[5][5];
		base[1][0] = 0; base [2][0] = 1; base[3][0] = 1; base[2][1] = 0;
	
		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		for (int i=0; i<n; i++) {
			int m = scan.nextInt();
			int x = scan.nextInt();
			int y = scan.nextInt();
			rec(m,base);  //can work in x y function
//		}
//		scan.close();
		

	}
	
	public static void rec(int m, int[][] floor) {
		//base case
		if (m==1) {}
		
		else {
			int[][] ne = new int[floor.length*5][floor.length*5];
			
			for (int col=1; col<floor.length/5; col++) {  // Top to Down
				for (int row=1; row<floor.length/5; row++) { // L to R   priority here
					
					
					
				}
			}
			
			rec(m-1,ne);
			
		}
		
		
	}
	
	
	
	
	
	
/*	public static void rec(int m, int x, int y, int[][] floor) {
		if (m==1) { //no more magnifications to do
			if (floor[x][y] == 1) System.out.println("crystal");
			if (floor[x][y] == 0) System.out.println("empty");
		}
		else { //magnify:
			int[][] ne = new int[floor.length*5][floor.length*5];
			
			for (int col=0; col<floor.length-1; col++) {  // L to R
				for (int row=floor.length-1; row>0; row--) { // Top to Down
					
				}
			}
			
			rec(m-1,x,y,ne);
		}
			
	}*/

}



