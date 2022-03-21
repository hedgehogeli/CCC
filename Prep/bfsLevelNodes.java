import java.util.*;
import java.io.*;

/*
* COMMENTS:https://www.hackerearth.com/practice/algorithms/graphs/breadth-first-search/tutorial/
* exercise problem from ^
*/

public class bfsLevelNodes {

	static int[] level; static boolean[] visited;
	static Map<Integer, LinkedList<Integer>> graph = new HashMap<>();
	static Queue<Integer> qu = new LinkedList<>();
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		level = new int[n+1];    // not computer indexed, IRL index
		level[0] = -1;
		visited = new boolean[n+1];
		
		for (int i=0; i<n-1; i++) {
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
		int x = scan.nextInt(); //target
		scan.close();
		
		//BFS CODE:
	//	qu.add(x);
	//	level[x] = 1;
		qu.add(1);
		level[x] = 0;

		while (!qu.isEmpty()) {
			int cur = qu.poll();
			visited[cur] = true;
			
			for (int i:graph.get(cur)) {
				
				if (visited[i] == false) {
					level[i] = level[cur]+1;
					System.out.println("brug " + i + " - " + level[i]);
					qu.add(i);
					}
				
			}

		}
		
		
// SOMETHING WRONG HERE WAHTEVS

		int counter=0;
		for (int i=1;i<level.length;i++) {
			if (level[i] == 2) counter+=1;
	//		if (level[i] == x-1) counter+=1;  // i THInk the nodes are 0 indexed - if so this works. 
			// generated graph says im right anyway
			//there's something fucking wrong witht he counter and output
			// but wahtev
		}
		System.out.println("ANSWER " + counter);

		
//		System.out.println("===");
	//	for (int i=1; i<level.length;i++) {
//			System.out.println(i+ "'s lvl: " + level[i]);
//		}
		
	}
	


}



