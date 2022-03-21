import java.util.*;
import java.io.*;

/*
* COMMENTS:https://www.hackerearth.com/practice/algorithms/graphs/breadth-first-search/practice-problems/algorithm/social-networking-graph/
* 
*/

public class HEsocialnetworkinggraph {
	
	static boolean[] visited;
	static int[] distance;
	static Map<Integer, LinkedList<Integer>> graph = new HashMap<>();

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int e = scan.nextInt();
		
		visited = new boolean[n+1];
		distance = new int[n+1];
		//take input
		for (int i=0;i<e;i++) {
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
		
		int m = scan.nextInt();
		for (int i=1; i<=m; i++) {
			int q = scan.nextInt();
			int d = scan.nextInt();
			bfs(q, d);
	//		System.out.println("DISTANCES");
	//		for (int i=1; i<=n; i++) {
	//			System.out.print(" node " + i + " dis " + distance[i] + " / ");
	//		}
			Arrays.fill(visited, false);
			Arrays.fill(distance, 0);
		}
		
		

	}
	
	public static void bfs (int n, int d) {
		
		int count = 0;
		
		Queue<Integer> qu = new LinkedList<>();
		qu.add(n);
		visited[n] = true;
		while(!qu.isEmpty()) {
			
			int cur = qu.poll();
			if (distance[cur]==d) count += 1;
			LinkedList<Integer> kids = graph.get(cur);
			if (kids == null) continue;
			else {
				for (int kid:kids) {
				if (visited[kid] == false) {
					visited[kid] = true;
					distance[kid] = distance[cur] + 1;
					qu.add(kid);
					}
				}
			}	
			
			
		}// end of while
		System.out.println(count);
	}

}



