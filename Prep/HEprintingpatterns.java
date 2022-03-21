import java.util.*;
import java.io.*;

/*
* COMMENTS:
* fuck it
*/

public class HEprintingpatterns {
	
	static int[][] graph;
	static boolean[][] visited;
	static int r, c;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt();
		c = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		
		graph = new int[r][c];
		graph[x][y] = 0;
		visited = new boolean[r][c];
		visited[x][y] = true;
		
		rec(x,y);

		//output:
		
		for (int i=0; i<c; i++) {
			for (int k=0; k<r; k++) {
				System.out.print(graph[k][i] + " ");
			}
			System.out.println();
		}
		
		
		
		
	}
	
	public static void rec(int x, int y) {
		System.out.println(x + " " + y);
		
		visited[x][y] = true;
		if (x==0 || y==0 || x==r-1 || y==c-1) return;
		
		//
		
		if (visited[x][y+1] == false) {
//			visited[x][y+1] = true;
			graph[x][y+1] = graph[x][y]+1;
		}
		if (visited[x][y-1] == false) {
//			visited[x][y-1] = true;
			graph[x][y-1] = graph[x][y]+1;
		}
		if (visited[x+1][y+1] == false) {
//			visited[x+1][y+1] = true;
			graph[x+1][y+1] = graph[x][y]+1;
		}
		if (visited[x+1][y] == false) {
//			visited[x+1][y] = true;
			graph[x+1][y] = graph[x][y]+1;
		}
		if (visited[x+1][y-1] == false) {
	//		visited[x+1][y-1] = true;
			graph[x+1][y-1] = graph[x][y]+1;
		}
		if (visited[x-1][y] == false) {
///			visited[x-1][y] = true;
			graph[x-1][y] = graph[x][y]+1;
		}
		if (visited[x-1][y+1] == false) {
//			visited[x-1][y+1] = true;
			graph[x-1][y+1] = graph[x][y]+1;
		}
		if (visited[x-1][y-1] == false) {
//			visited[x-1][y-1] = true;
			graph[x-1][y-1] = graph[x][y]+1;
		}
		 //
		
		if (visited[x][y+1] == false) {
			visited[x][y+1] = true;
			rec(x,y+1);
		}
		if (visited[x][y-1] == false) {
			visited[x][y-1] = true;
			 rec(x,y-1); 
		}
		if (visited[x+1][y+1] == false) {
			visited[x+1][y+1] = true;
			rec(x+1,y+1);
		}
		if (visited[x+1][y] == false) {
			visited[x+1][y] = true;
			rec(x+1,y);
		}
		if (visited[x+1][y-1] == false) {
			visited[x+1][y-1] = true;
			 rec(x+1,y-1); 
		}
		if (visited[x-1][y] == false) {
			visited[x-1][y] = true;
			rec(x-1,y);
		}
		if (visited[x-1][y+1] == false) {
			visited[x-1][y+1] = true;
			rec(x-1,y+1);
		}
		if (visited[x-1][y-1] == false) {
			visited[x-1][y-1] = true;
			 rec(x-1,y-1); 
		}
		
		 
		
		 
	}

}



