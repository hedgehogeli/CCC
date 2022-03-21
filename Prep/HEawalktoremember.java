import java.util.*;
import java.io.*;

/*
* COMMENTS:
*/

public class HEawalktoremember {
	
	static Map<Integer, LinkedList<Integer>> graph = new HashMap<>();
	static Map<Integer, LinkedList<Integer>> revgraph = new HashMap<>();
	static boolean[] visited, used;
	static Stack<Integer> order = new Stack<>();
	static Stack<Integer> component = new Stack<>();

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); //# nodes
		int e = scan.nextInt(); //# directed edge
		visited = new boolean[n+1];
		used = new boolean[n+1];
		
		// making adj list
		for (int i=0; i<e; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			// normal graph
			if (!graph.containsKey(x) ) {
				LinkedList<Integer> temp = new LinkedList<>();
				graph.put(x,temp);
			}
			graph.get(x).add(y);
			
			//reversed graph
			if (!revgraph.containsKey(y) ) {
				LinkedList<Integer> temp = new LinkedList<>();
				revgraph.put(y,temp);
			}
			revgraph.get(y).add(x);
		}
		
		dfs1(1);
		
		Arrays.fill(visited, false);
		
		while (!order.isEmpty()) {
			int v = order.pop();
			if (visited[v] == false) {
				dfs2(v);
			}
		}
		
		for (int i=1; i<=n; i++) {
			if (component.contains(i)) System.out.println(1);
			else System.out.println(0);
		}
		
		
	}
	
	public static void dfs1(int node) {
		visited[node] = true;
		if (graph.get(node)==null) return;
		else {
		for (int kid : graph.get(node)) {
			if (visited[kid] == false) {
				dfs1(kid);
			}
		} }
		//System.out.println(node + " done");
		order.push(node);
	}
	
	public static void dfs2(int node) {
		visited[node] = true;
		component.push(node);
		if (graph.get(node)==null) return;
		else {
		for (int kid : revgraph.get(node)) {
			if (visited[kid] == false) {
				dfs2(kid);
			}
		} }
	}

}



