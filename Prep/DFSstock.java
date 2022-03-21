import java.util.*;
import java.io.*;

/*
* COMMENTS: looking at problem on 
* https://www.hackerearth.com/practice/algorithms/graphs/depth-first-search/tutorial/
*/

public class DFSstock {

	static boolean[] visited;
	static Map<Integer, LinkedList<Integer>> graph;
	
	public static void main(String[] args) {
		
		//input and creation of adjacency list
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int lines = scan.nextInt();
		
		graph = new HashMap<>();
		
		//for undirected graph (both ways_
		for (int i=0;i<lines;i++) {
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
		
		// IF I DONT WANT TO USE MAP:
/*		LinkedList<Integer>[] graph = new LinkedList<>[n];
		for (int k=0;k<n;k++) {
			graph[k] = new LinkedList<Integer>();
		}*/

		visited = new boolean[n];
		
		// actual code:
		int components = 0;
		for (int k=0;k<n;k++) {
			if (!visited[k]) {
				components += 1; 
				dfs(k);
			}
		} 

		System.out.println(components);
		
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
	
	

}



