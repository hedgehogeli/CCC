import java.util.*;
import java.io.*;

/*
* COMMENTS: https://dmoj.ca/problem/ccc18j5
* not done
* i have no idea if i used dfs or bfs
* furthermore i have no idea what i'm doing wrong. none at all. 
* 
*/

public class ccc18j5 {
	
//	static boolean[] visited;
	static int[] visited;
	static Map<Integer, LinkedList<Integer>> graph = new HashMap<>();
	static int c;
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int pages = scan.nextInt();
	//	visited = new boolean[pages+1];
		//Arrays.fill(visited, false); visited[0] = true;
		visited = new int[pages+1]; 
		Arrays.fill(visited, 0); visited[0]=1;
		
		
	//	for (int i=0; i<visited.length; i++) {
	//		System.out.println("index " + i + ":" + visited[i]);
	//	}
		
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
		
		spread(1,1);
		
		boolean reach = true;
	/*	for (boolean i : visited) {
			if (i==false) reach= false;
		}
		/*/
		
		for (int i: visited) {
			if (i<=0) reach = false;
		}
		
		if (reach == false) System.out.println("N");
		else System.out.println("Y");
		
		System.out.println(c);
		
	}
	
	public static void spread(int s, int count) {
		//visited[s] = true;

		visited[s] = visited[s]+1;
		LinkedList<Integer> cur = graph.get(s);
		if (cur==null) {}
		if(cur.peek()==0) {
			if (count<c) c = count; // something wrong with shortest path
			System.out.println(cur + " s=" + s + " c:" + c);
		}
		else {	for (int kid:cur) {
		//	if (!visited[kid]) {
		//		spread(kid, count+1);
		//	}
			if (visited[kid]<15 ) { // assuming the loops aren't over 20 - which should be safe?
				spread(kid, count+1);
			}
		}
	}//end else
		
	}
	
	

}



