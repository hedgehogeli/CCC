import java.util.*;
import java.io.*;

/*
* COMMENTS:
*/

public class ccc2021s1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] heights = new int[n+1];
		for (int i=0; i<=n; i++) {
			heights[i]=scan.nextInt();
		}
		
		int[] widths = new int[n];
		for (int i=0; i<n; i++) {
			widths[i]=scan.nextInt();
		}
		
		scan.close();
		
		Double area = 0.0;
		for (int i=0; i<n; i++) {
			area = area + (Double.valueOf(heights[i]+heights[i+1])/2*widths[i]);
		}
		System.out.println(area);
		

	}

}



