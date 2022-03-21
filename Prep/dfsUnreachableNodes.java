import java.util.*;
import java.io.*;

/*
* COMMENTS: from the bottom exercise of:
* https://www.hackerearth.com/practice/algorithms/graphs/depth-first-search/tutorial/
* 
* works if you ignore jeff part
*/

public class dfsUnreachableNodes {

	static boolean[] visited;
	static Map<Integer, LinkedList<Integer>> graph;
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int nodes = scan.nextInt(); int edges = scan.nextInt();
		
		visited = new boolean[nodes+1];
		graph = new HashMap<>();
		
//		for (int i=0;i<visited.length;i++) {
//			System.out.println("visited[" + i + "]: " + visited[i] );
//		}
		
		for (int i=0;i<edges;i++) {
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
		
		int head = scan.nextInt();
		scan.close();
		
		dfs(head);
		
		int unreach = 0;
		for (int i=1;i<nodes;i++) {
			if (visited[i]==false) unreach += 1;
		}
		System.out.println(unreach);

	}

	public static void dfs (int s) {
		visited[s] = true;
		LinkedList<Integer> cur = graph.get(s);
		if(cur == null) return;
		for (int kid:cur) {
			if (!visited[kid]) {
				dfs(kid);
			}
		}
	}
	
	// LINKED LIST ALTERNATIVE TO MAP
	
	
	public static LinkedList<Integer>[] jeffGraph;
	public static int n; public static int m;
	public static int[] jeffVisited;
	
	public static void JEFFCODE() {
		Scanner scan= new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		jeffGraph = new LinkedList<>[n];
		
		for (int k=0;k<n;k++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			jeffGraph[x].add(y);
			jeffGraph[y].add(x);
		}
		int head = scan.nextInt();
		// finish graph
		
		jeffdfs(head);
		
		// do loop ez visited
		
	}
	
	public static void jeffdfs (int s) {
	//same as what i did
	}

	
}



