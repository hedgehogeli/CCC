import java.util.*;
import java.io.*;

/*
* COMMENTS:
*/

public class LCCMoose2019S2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] start = new int[n];
		int[] speed = new int [n];
		for (int i=0;i<n;i++) {
			start[i] = scan.nextInt();
			speed[i] = scan.nextInt();  } 
		
		HashMap<Integer, Integer> map = new HashMap<>(); 
		
		int key = 0, counter = 0;

		///this only works in linear - ur not accounting for all (n pick 2) 
		// fucking dumbass edward tard
		//add another for loop
		//i dont want to do it today so fuck you future edward
		
		for (int i=1;i<n;i++) {
			int x = sectX(speed[i],start[i],speed[i-1],start[i-1]);
			if (x > 0) {
				int y = sectY (x,speed[i],start[i]);
				if (map.containsKey(10000*x + y)) {
					int temp = map.get(10000*x + y);
					map.replace(10000*x + y, temp+1);
					counter = temp+1;
					key = 10000*x + y;
				}
				else {
					map.put(10000*x + y, 1);
			//		if (counter == 0) counter = 1;
					
				}
			}
		} 
		
		System.out.println(counter + " " + key/10000 + " " + key%10000);
		
	//	for (int i=n;i>0;i--) {
	//		if (map.containsValue(i)) {
	//			map.ge
	//		}
	//	}
		
		
	}
	
	public static int sectX(double m1, double b1, double m2, double b2) {
		Double temp = ((b2-b1)/(m1-m2));
		if (temp == Math.round(temp) && temp>0) {
			return (int) Math.round(temp);
		}
		else return -1;
	}
	
	public static int sectY (int x, int m, int b) {
		return x*m + b;
	}
	
	

}



