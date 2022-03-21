import java.util.*;
import java.io.*;

/*
* COMMENTS: https://dmoj.ca/problem/ccc01s3
* YAS QUEEN SLAYYYY
*/

public class ccc01s3 {

	static Map<Integer, LinkedList<Integer>> graph = new HashMap<>();
	static boolean[] visited = new boolean[27];
	
	public static void main(String[] args) {
		// INITIALISATION OF VISITED ARRAY
		Arrays.fill(visited, false);
		
		
		Scanner scan = new Scanner(System.in);
		
//		for (int i=65;i<=90;i++) {char temp = (char) i;System.out.print(temp);} System.out.println();
		
		Queue<String> qu = new LinkedList<>(); 
		String input = scan.nextLine();
		int edges = 0;
		while (!input.equals("**")) {
			qu.add(input);
			edges+=1;
			input = scan.nextLine();
		}
		scan.close();
		
		int counter = 0;
		for (int i=0; i<edges; i++) {
			String removed = qu.poll(); // remove one and run dfs on rest
			
			for (int k=0;k<edges-1;k++) {
				String tempRemove = qu.poll();  //cycle through all remaining elements to create adjacency list
				qu.add(tempRemove); //reinsert to the back
				int x = tempRemove.charAt(0) - 64;
				int y = tempRemove.charAt(1) - 64;
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
				// ===============================================
				
				
			}
			
			//run dfs
			dfs(1);
			
			//check B, and if good then print 
			if (visited[2] == false) {System.out.println(removed); counter+=1;}
			
			//wipe map and visited
			graph = new HashMap<>();
			visited = new boolean[27]; Arrays.fill(visited, false);
			
			qu.add(removed); //at the end reinsert removed
		}
		
		
		
		System.out.println("There are " + counter + " disconnecting roads.");
		
	
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



