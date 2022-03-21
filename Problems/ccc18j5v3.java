import java.util.*;
import java.io.*;

/*
* COMMENTS: THIS ONE USES BFS + dijkstra
* 
* I FINALLY DID IT
*/

public class ccc18j5v3 {

	static boolean[] visited;
	static int[] level;
	static Map<Integer, LinkedList<Integer>> graph = new HashMap<>();
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int pages = scan.nextInt();
		visited = new boolean[pages+1]; // so pages are indexed 1
		level = new int[pages+1];
		Arrays.fill(visited, false); visited[0] = true;  // just getting rid of index 0
		Arrays.fill(level, 100000); level[0] = 1;
		
		
		for (int page=1;page<=pages;page++) { //one directional adj list where 0 means end
			//mapping a page to a set (linkedlist) with paths
			int x = scan.nextInt();
			if (x==0) { // if end page just stick 0
				LinkedList<Integer> temp = new LinkedList<>();
				graph.put(page,temp);
				graph.get(page).add(0);
			}
			else { 	for (int k=0;k<x;k++) { // just stick everything in for all the values given
					int y = scan.nextInt();
					if (!graph.containsKey(page) ) {
						LinkedList<Integer> temp = new LinkedList<>();
						graph.put(page,temp);
					}
					graph.get(page).add(y);
				}}
		}
		scan.close();
		
		Queue<Integer> qu = new LinkedList<>(); 
		qu.add(1); level[1] = 1;
		
		int c = 100000;
		while (!qu.isEmpty()) {
			int cur = qu.poll(); // int cur = next up in queue
			visited[cur] = true;
			System.out.println(cur + " marked visited:" + visited[cur]);
			
			for (int i : graph.get(cur)) { // for int i cycling thru all elements in the queue that is summoned
				if (visited[i] == false) {
					visited[i] = true;
					level[i] = level[cur] + 1; // add mark level
					
					System.out.println("node " + i + "-" + " lvl: " + level[i] + " " + graph.get(i));
					System.out.println(i + " assigned d of " + level[i] + " or " + level[cur] + "+1 coming from cur=" + cur);
					
						if (graph.get(i).contains(0)) { // if page[i] is an end page
							if (level[i]<c) c = level[i];
							System.out.println("END NODE: " + i + " at lvl " + level[i]);
						}
					qu.add(i); // queue element
				}
			}
		}
		
		System.out.println("========");
		System.out.println(graph.get(40));
		
		
		boolean reach = true;
		for (boolean i:visited) {
			if (!i) reach = false;
		}
		
		if (reach) System.out.println("Y");
		else System.out.println("N");
		
		System.out.println(c);
		
		
		

	}

}



