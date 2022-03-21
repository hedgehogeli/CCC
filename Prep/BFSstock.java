import java.util.*;
import java.io.*;

/*
* COMMENTS:
* this is a literal stock code
* 
* visited = boolean array
* graph = adjacency list - map <Integer, LinkedLIst>
* 
*/

public class BFSstock {

	public static void main(String[] args) {
		
		// inputs
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
		
		
		
		// ACTUAL BFS
		Queue<Integer> qu = new LinkedList<>();
		qu.add(n);
		visited[n] = true;
		
		while(!qu.isEmpty()) {
			int cur = qu.poll();
			LinkedList<Integer> kids = graph.get(cur);
			if (kids == null) continue;
			else {
				for (int kid:kids) {
				if (visited[kid] == false) {
					visited[kid] = true;
					// do wahtever u need to do prollly here
					qu.add(kid);
					}
				}
			}	
			
			
		}// end of while

	}

}



