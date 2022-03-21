import java.util.*;
import java.io.*;

/*
* COMMENTS:
*/

/*	Scanner scan = new Scanner(System.in);
//int n = scan.nextInt();
//scan.close();

//BufferedReader mReader = new BufferedReader(new InputStreamReader(System.in));
//int n = Integer.parseInt(mReader.readLine());
//String[] inputArray = mReader.readLine().split(" ");
//	mReader.close();	*/	

public class CCC2020s1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		HashMap<Integer, Integer> map = new HashMap<>(); 
		int[] times = new int[n];
		
		for (int i=0; i<n; i++) {
			int t = scan.nextInt();
			int d = scan.nextInt();
			
			times[i] = t;
			map.put(t, d);
			
		}
		Arrays.sort(times);
		
//		for (int i:times) {
//			System.out.println(i + " " + map.get(i));
//		}
		
		Double highestSpeed = 0.0;
		for (int i=1;i<n;i++) {
			Double dist = absVal((double) (map.get(times[i]) - map.get(times[i-1])));
			Double t = (double) (times[i] - times[i-1]);
			Double speed = (double) (dist/t);
			
			if (highestSpeed<speed) highestSpeed = speed;
		}
		
		System.out.println(highestSpeed);
		
	}
	
	public static Double absVal(Double input) {
		if (input < 0) {
			return input*-1;
			
		}
		else return input;
	}

}



