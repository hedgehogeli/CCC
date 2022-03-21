import java.util.*;
import java.io.*;

/*
* COMMENTS:
*/

public class ccc2021s4_try2 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader mReader = new BufferedReader(new InputStreamReader(System.in));
		String[] line = mReader.readLine().split(" ");
		int N = Integer.valueOf(line[0]), W = Integer.valueOf(line[1]), D = Integer.valueOf(line[2]);
		
		
		HashMap<Integer, LinkedList<Integer>> graph = new HashMap<>();
		//INPUT W SET
		int[][] WDL = new int[W][2];
		for(int i=0; i<W; i++) {
			String[] Ws = mReader.readLine().split(" ");
			WDL[i][0] = Integer.valueOf(Ws[0]);
			WDL[i][1] = Integer.valueOf(Ws[1]);
			
			// CREATION OF REVERSE GRAPH
			for(int k=0; k<W; k++) {
				
				int A = WDL[k][0];
				int B = WDL[k][1];
				
				if (!graph.containsKey(B) ) {
					LinkedList<Integer> temp1 = new LinkedList<>();
					graph.put(B,temp1);
				}
				graph.get(B).add(A);
			}
			
		}
		
		// INPUT N SET
		String[] Ns = mReader.readLine().split(" ");
		int[] track = new int[N];
		for (int i=0; i<N; i++) {
			track[i] = Integer.valueOf(Ns[i]);
		}
		
		// INPUT D SET
		//swaps are index based
		for (int i=0; i<D; i++) {
			
			//some initialisation
			boolean[] visited = new boolean[N+1];
			int[] DFN = new int[N+1];
			Arrays.fill(visited, false);
			Arrays.fill(DFN, 999999999);
			
			
			String[] Ds = mReader.readLine().split(" ");
			int X = Integer.valueOf(Ds[0])-1;
			int Y = Integer.valueOf(Ds[1])-1;
			
			//update track
			int temp = track[Y];
			track[Y] = track[X];
			track[X] = temp;
			
			//TRAIN's distance from node ONE to node ?
			int[] DF1 = new int[N+1];
			for (int c=1; c<=N; c++) {
				DF1[track[c-1]] = c-1;
			}
			
			//running DFS ***FROM N***
			Queue<Integer> qu = new LinkedList<>();
			qu.add(N);
			visited[N] = true;
			DFN[N]=0;
			
			while(!qu.isEmpty()) {
				int cur = qu.poll();
				LinkedList<Integer> kids = graph.get(cur);
				if (kids == null) continue;
				else {
					for (int kid:kids) {
					if (visited[kid] == false) {
						visited[kid] = true;
						
						DFN[kid] = DFN[cur]+1;
						
						qu.add(kid);
						}
					}
				}	
				
				
			}  // end of DFS
			
			int mindis = Integer.MAX_VALUE;
			for (int k=1; k<=N; k++) {
				int res = DF1[k] + DFN[k];
				if (res < mindis) mindis = res;
			}
			
			System.out.println(mindis);
			
			
	//		System.out.println(distance[N]);
			
		} // end of D loop
		
		

	}

}



