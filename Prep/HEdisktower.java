import java.util.*;
import java.io.*;

/*
* COMMENTS:https://www.hackerearth.com/zh/practice/data-structures/queues/basics-of-queues/practice-problems/algorithm/disk-tower-b7cc7a50/
*/

public class HEdisktower {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		/*PriorityQueue<Integer> pQ = new PriorityQueue<Integer>(Collections.reverseOrder()); 
		
		int max = n;
		for (int i=1; i<=n; i++) {
			pQ.add(scan.nextInt());
			System.out.println();
			
			while (pQ.isEmpty() == false && pQ.peek() == max) {
				System.out.print(pQ.poll() + " ");
				max += -1;
			}
			
		}
		scan.close(); */ // two ways to do it -- pQ and set but pQ prolly better /
		
		// set only rly works cuz the problem is simpel
		
		HashSet<Integer> set = new HashSet<Integer>(); 
		int max = n;
		for (int i=1; i<=n; i++) {
			set.add(scan.nextInt());
			System.out.println();
			
			while (set.isEmpty() == false && set.contains(max)) {
				System.out.print(max + " ");
				set.remove(max);
				max += -1;
			}
			
		}
		
	}

}



