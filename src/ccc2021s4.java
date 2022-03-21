import java.util.*;
import java.io.*;

/*
* COMMENTS:
*/

public class ccc2021s4 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader mReader = new BufferedReader(new InputStreamReader(System.in));
		String[] line = mReader.readLine().split(" ");
		int N = Integer.valueOf(line[0]), W = Integer.valueOf(line[1]), D = Integer.valueOf(line[2]);
		
		
		
		//INPUT W SET
		int[][] WDL = new int[W][2];
		for(int i=0; i<W; i++) {
			String[] Ws = mReader.readLine().split(" ");
			WDL[i][0] = Integer.valueOf(Ws[0]);
			WDL[i][1] = Integer.valueOf(Ws[1]);
		}
		
		// INPUT N SET
		String[] Ns = mReader.readLine().split(" ");
		int[] track = new int[N];
		for (int i=0; i<N; i++) {
			track[i] = Integer.valueOf(Ns[i]);
		}
		//set up initial graph
		/*for (int i=0; i<N-1; i++) {
			int x = track[i];
			int y = track[i+1];
			
			if (!graph.containsKey(x) ) {
				LinkedList<Integer> temp = new LinkedList<>();
				graph.put(x,temp);
			}
			graph.get(x).add(y);
		} */
		
		
		
		// INPUT D SET
		//swaps are index based
		for (int i=0; i<D; i++) {
			boolean[] visited = new boolean[N+1];
			int[] distance = new int[N+1];
			//some initi
			Arrays.fill(visited, false);
			Arrays.fill(distance, 0);
			
			HashMap<Integer, LinkedList<Integer>> graph = new HashMap<>();
			
			String[] Ds = mReader.readLine().split(" ");
			int X = Integer.valueOf(Ds[0])-1;
			int Y = Integer.valueOf(Ds[1])-1;
			
			//update Ns
			int temp = track[Y];
			track[Y] = track[X];
			track[X] = temp;
			
			//create temp graph
			//graphing Walks
			for(int k=0; k<W; k++) {
				
				int A = WDL[k][0];
				int B = WDL[k][1];
				
				if (!graph.containsKey(A) ) {
					LinkedList<Integer> temp1 = new LinkedList<>();
					graph.put(A,temp1);
				}
				graph.get(A).add(B);
			}
			
			//graphing track
			for (int k=0; k<N-1; k++) {
				int x = track[k];
				int y = track[k+1];
				
				if (!graph.containsKey(x) ) {
					LinkedList<Integer> temp2 = new LinkedList<>();
					graph.put(x,temp2);
				}
				graph.get(x).add(y);
			}
			
			//done creating graph
			
			//running DFS now
			Queue<Integer> qu = new LinkedList<>();
			qu.add(1);
			visited[1] = true;
			distance[1]=0;
			for (int e=2; e<N; e++) {
				distance[e]=e-1;
			}
			
			
			while(!qu.isEmpty()) {
				int cur = qu.poll();
				LinkedList<Integer> kids = graph.get(cur);
				if (kids == null) continue;
				else {
					for (int kid:kids) {
					if (visited[kid] == false) {
						visited[kid] = true;
						
						
						
						distance[kid] = distance[cur]+1;
//System.out.println("dis of " + kid + " = " + distance[kid]);
						if(kid==N) System.out.println(distance[N]);;
						
						// do wahtever u need to do prollly here
						qu.add(kid);
						}
					}
				}	
				
				
			}
			
			// end of DFS
	//		System.out.println(distance[N]);
			
		}
		
		

	}

}



