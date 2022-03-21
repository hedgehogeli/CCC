import java.util.*;
import java.io.*;

/*
* COMMENTS: https://www.hackerearth.com/zh/practice/algorithms/graphs/depth-first-search/practice-problems/algorithm/happy-vertices/
yeet
*/

public class HEhappyvertices {

	static boolean[] visited;
	static int[] kidNum, parent;
	static Map<Integer, LinkedList<Integer>> graph = new HashMap<>();
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); 
		int e = scan.nextInt();
		
		visited = new boolean[n+1];
		kidNum = new int[n+1];
		parent = new int[n+1];
		
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
		scan.close();
		
		//running dfs, guaranteeing lowest node is hit first
		for (int i=1; i<=n; i++) {
			if (visited[i] == false) {
				dfs(i);
			}
		}
		
		int happycount=0;
		for (int i=1; i<=n; i++) {
			if (kidNum[i] > kidNum[parent[i]]) {
				happycount+=1;
			}
		}
		System.out.println(happycount);

	}
	
	public static void dfs (int node) {
		visited[node] = true;
		
		if (parent[node] == 0) {
			parent[node] = node;
		}
		
		LinkedList<Integer> kids = graph.get(node);
		
		if (kids == null) {
			kidNum[node] = 0;
			return;
		}
			
		if (parent[node] == node) {
		kidNum[node] = kids.size();
		}
		else {
			kidNum[node] = kids.size() -1;
		}
		for (int kid : kids) {
			if (visited[kid] != true) {
				visited[kid] = true; //ik its redundant
				parent[kid] = node;
				dfs(kid);
			}
		}
	}

}



