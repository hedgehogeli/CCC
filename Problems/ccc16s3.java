import java.util.*;
import java.io.*;

/*
* COMMENTS: https://dmoj.ca/problem/ccc16s3
* 
10 5
2 4 5 8 9
0 1
0 2
2 3
4 3
6 1
1 5
7 3
6 8
1 9

*/

public class ccc16s3 {

	static Map<Integer, LinkedList<Integer>> graph = new HashMap<>();
	static LinkedList<Integer> quP = new LinkedList<>();
	static HashMap<Integer, Boolean> pVis = new HashMap<>(); //int bool for the pho restaurants
	static int n;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt(); int p = scan.nextInt();
		
		for (int i=0; i<p; i++) {
			int temp = scan.nextInt();
			pVis.put(temp, false);
			quP.add(temp);
		}
		
		
		for (int i=0; i<n-1; i++) { // bidirectional adjacency list
			int x = scan.nextInt();
			int y = scan.nextInt();
			if (!graph.containsKey(x) ) {
				LinkedList<Integer> temp = new LinkedList<>();
				graph.put(x,temp);
			}
			graph.get(x).add(y);
			if (!graph.containsKey(y) ) {
				LinkedList<Integer> temp = new LinkedList<>();
				graph.put(y,temp);
			}
			graph.get(y).add(x);
		}
		scan.close();
		
		
		
		int out = 100000;
		for (int i : quP) {
			int te = recurse(i, 0);
			System.out.println("node " + i + ": " + te );
			if (te<out) out = te;
		}
		System.out.println(out); 
		
	//	System.out.println(recurse(4, 1));
		
		
	} // end main
	
	
	public static int recurse(int start, int iter) { ///// MAKR THE ONES THAT ARE VISITED
		
		if (iter>5) { // arbitrary, maybe make bigger
			return 999999;
		}
		
		//run bfs from this node
		Queue<Integer> qu = new LinkedList<>(); 
		boolean[] visited = new boolean[n];
		int[] lvl = new int[n];
		
		qu.add(start);
		int length = -1, kiddo = -1; lvl[start] = 0;
		while(qu.isEmpty() == false) {
			int cur = qu.poll();
			visited[cur] = true;
			//
	//		System.out.println(cur + " gens " + graph.get(cur));
			//
			for (int kid : graph.get(cur)) {
				if (visited[kid]==false) {
					System.out.print(kid);
					lvl[kid] = lvl[cur] + 1;
					if (quP.contains(kid)) { 
						System.out.println("quP contains " + kid);
						System.out.println("lvl of " + kid + ":" + lvl[kid]);
						length = lvl[kid];
						kiddo = kid;
						
	//					pVis.replace(kid, true);
						break;
					}
					
					qu.add(kid);
				}
			}
			
		}
		
		if (length == -1 && kiddo == -1) return 99999;
		
		boolean temp = true;
		for (int i : quP) {
			if (pVis.get(i)==false) temp = false;
		}
		if (temp == true) { System.out.println("tru");
			return length;
		}
		else {
			return recurse(kiddo, iter+1) + length;
		}
	}

}



