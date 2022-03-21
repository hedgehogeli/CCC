import java.util.*;
import java.io.*;

/*
* COMMENTS:
* https://www.hackerearth.com/practice/algorithms/graphs/depth-first-search/practice-problems/algorithm/b-31/
*/

public class HEpearl2018 {
	
	
	public static class Edge{
		int a , w;
		public Edge(int a1, int w1){
			a=a1; w=w1;
		}
	}
	
	static ArrayList<LinkedList<Edge> > graph = new ArrayList<>();
	static int[] toHotel;
	static int[] distance; //from node 1 to X
	static boolean[] visited;

	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		toHotel = new int[n+1];
		distance = new int[n+1];
		visited = new boolean[n+1];
		
		for (int i=1; i<=n; i++) {
			toHotel[i] = scan.nextInt();
		}
		
		int totalRound = 0;
		for(int k=0; k<=n; k++) {
			graph.add(new LinkedList<Edge>() ); 
		}
        for(int k=1; k<n; k++){
            int x = scan.nextInt();
            int y = scan.nextInt();
            int w = scan.nextInt();
            graph.get(x).add( new Edge(y,w) );
            graph.get(y).add( new Edge(x,w) );
            totalRound += w*2;
        }  //finished graph
		
        
		//now brute force all nodes as the end
		
		int min = (1<<31)-1;
		distance[1] = 0;
		dfs(1, 0);
		
		//run dfs once to save on computing, make array for distance 1-nodek
		
		for (int k=1; k<n; k++) {
			int p = (totalRound - distance[k] + toHotel[k]);
			if (p < min) {
				min = p;
			}
		}
		System.out.println(min);
		

	}
	
	public static void dfs(int u, int pa) {
		visited[u] = true;
		LinkedList<Edge> cur = graph.get(u);
		for (Edge e : cur) {
			if (visited[e.a]==false && e.a!=pa) {
				visited[e.a]=true;
				distance[e.a] = distance[u] + e.w;
				dfs(e.a, u);
			}
			
		}
		
	}
	
	

}



