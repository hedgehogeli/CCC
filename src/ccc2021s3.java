import java.util.*;
import java.io.*;

/*
* COMMENTS:
*/

public class ccc2021s3 {

	public static void main(String[] args) throws Exception {
		
		
		
		BufferedReader mReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(mReader.readLine());
		
		long[][] stats = new long[n][3];
		//where 0=position, 1=walkspeed, 2=heardistance
		
		long pmax = 0;
		long pmin = Long.MAX_VALUE;
		for (int i=0; i<n; i++) {
			String input = mReader.readLine();
			String[] temp = input.split(" ");
			stats[i][0] = Long.parseLong(temp[0]);
			stats[i][1] = Long.parseLong(temp[1]);
			stats[i][2] = Long.parseLong(temp[2]);
			
			if (stats[i][0]>pmax) pmax = stats[i][0];
			if (stats[i][0]<pmin) pmin = stats[i][0];
		}
		
		long lowesttime = Long.MAX_VALUE;
		
		for (long c = pmin; c < pmax+1; c++) {
			long time = 0;
			for (int i=0; i<n; i++) {
				time = time + calcTime(c, stats[i][0], stats[i][1], stats[i][2]);
			}
			if (time < lowesttime) lowesttime = time;
		}
		
		System.out.println(lowesttime);

	}
	
	public static long calcTime (long C, long P, long W, long D) {
		long res = ( Math.abs(C-P) - D ) * W;
		if (res <= 0) return 0;
		else return res;
	}

}



