import java.util.*;
import java.io.*;

/*
* COMMENTS:https://www.hackerearth.com/practice/data-structures/trees/heapspriority-queues/practice-problems/algorithm/hostel-visit/
* done
*/

public class HEhostelvisits {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt(); //num of total queries
		int k = scan.nextInt(); //num of guaranteed hotels
		
		PriorityQueue<Long> pQ = new PriorityQueue<Long>(Collections.reverseOrder());
		
		for (int i=1; i<=k; i++) {
			scan.nextInt();
			long x = scan.nextInt();
			long y = scan.nextInt();
			long d = x*x+y*y;
			pQ.add(d);
		}
		for (int i=k+1; i<=q; i++) {
			int qType = scan.nextInt();
			if (qType == 1) {
				long x = scan.nextInt();
				long y = scan.nextInt();
				long d = x*x+y*y; 
				long dO = pQ.poll();
				if (d<dO) {pQ.add(d);}
				else pQ.add(dO);
					
			}
			if (qType == 2) {
				System.out.println(pQ.peek());
			}
		}
		
		scan.close();
	}
}