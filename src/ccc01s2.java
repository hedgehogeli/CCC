import java.util.*;
import java.io.*;

/*
* COMMENTS:
*/

public class ccc01s2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//enclose in a for loop for # of TCs
		
		
		
		int start = scan.nextInt();
		int end = scan.nextInt();
		int elements = end-start+1;
		int nearestsquare = 0;
		for (int i=1; i<=10; i++) {
			if (i*i>=elements) {
				nearestsquare = i; break;
			}
		}
		
		System.out.println(nearestsquare);
		
		int[][] out = new int[nearestsquare][nearestsquare];
		
		out[(nearestsquare-1)/2][(nearestsquare-1)/2] = start;
		
		for (int i=0; i<nearestsquare;i++) {
			for (int k=0; k<nearestsquare;k++) {
				System.out.print(out[i][k] + " ");
			}
			System.out.println();
		}
		
		
		
		
	}

}



