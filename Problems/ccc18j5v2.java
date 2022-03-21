import java.util.*;
import java.io.*;

/*
* COMMENTS: THIS ONE USES BFS
* 
* still somehow wrong kms
*/

public class ccc18j5v2 {

	static int[] visited;
	static int[] level;
	static Map<Integer, LinkedList<Integer>> graph = new HashMap<>();
	static int c;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int pages = scan.nextInt();
		visited = new int[pages+1];
		level = new int[pages+1];
		Arrays.fill(visited, 0); visited[0] = 1;
		c = 100000;
		
		for (int i=1;i<=pages;i++) { //one directional adj list where 0 means end
			int x = scan.nextInt();
			if (x==0) { // this just returns null so no need to put in 0
				LinkedList<Integer> temp = new LinkedList<>();
				graph.put(i,temp);
				graph.get(i).add(0);
			}
			else { 	for (int k=0;k<x;k++) {
					int y = scan.nextInt();
					if (!graph.containsKey(i) ) {
						LinkedList<Integer> temp = new LinkedList<>();
						graph.put(i,temp);
					}
					graph.get(i).add(y);
				}}
		}
		scan.close();
		
		Queue<Integer> qu = new LinkedList<>(); 
		qu.add(1); level[1] = 1;
		
		while (!qu.isEmpty()) {
			int cur = qu.poll();
			visited[cur] = visited[cur] + 1;
//			System.out.println("cur " + cur);
			
			if (cur!=0) {
			
			if (graph.get(cur).peek()==0 && level[cur]<c) c = level[cur];
			
			for (int i:graph.get(cur)) {
				if (visited[i]<10) {
					level[i] = level[cur] + 1;
					qu.add(i);
					
					
				}
			}
			
			}
		}
		
		boolean reach = true;
	//	for (boolean i : visited) {
	//		if (i==false) reach = false;
	//	}
		for (int i:visited) {
			if (i==0) reach = false;
		}
		
		if (reach) System.out.println("Y");
		else System.out.println("N");
		
		System.out.println(c);
		
		
		

	}

}



