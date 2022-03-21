import java.util.*;
import java.io.*;

/*
* COMMENTS: idek anymore just simple bfs i guess
*/

public class ccc18j5v4 {

	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		int pages = scan.nextInt();
		
		boolean[] visited = new boolean[pages+1]; visited[0] = true;
		int[] level = new int[pages+1]; 
		Map<Integer, LinkedList<Integer>> graph = new HashMap<>();
		int count = 0;
		
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
			int curPage = qu.poll();
			visited[curPage] = true;
			for (int kid : graph.get(curPage)) {
				if (!visited[kid]) {
					level[kid] = level[curPage] + 1;
					qu.add(kid);
				}
				
				if (kid == 0) {
					count = level[curPage];// System.out.println("r");
				}
			}
			
		}
		
		boolean reach = true;
		for (boolean i:visited) {
			if (!i) reach = false;
		}
		
		if (reach) System.out.println("Y");
		else System.out.println("N");
		
		System.out.println(count);
		

	}

}



