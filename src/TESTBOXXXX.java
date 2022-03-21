import java.util.*;
import java.io.*;

//https://www.hackerearth.com/zh/practice/algorithms/graphs/strongly-connected-components/practice-problems/algorithm/a-walk-to-remember-qualifier2/


public class TESTBOXXXX {
	
	static int n, e;
	static ArrayList<LinkedList<Integer>> gr = new ArrayList<>();
	static ArrayList<LinkedList<Integer>> REgr = new ArrayList<>();
	static boolean[] visit;
	static Stack<Integer> st = new Stack<>();
	static int[][] comp;
	static int curComp=0, numNodes = 0;
	
	public static void main(String[] args) throws Exception {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = new String[2];
		input = br.readLine().split(" ");
		n = Integer.parseInt(input[0]); e = Integer.parseInt(input[1]);
		visit = new boolean[n+1]; Arrays.fill(visit, false);
		comp = new int[n+1][2];
		
		for (int i=0; i<=n; i++) { // THIS AVOIDS NULLPOINTER
			gr.add(i, new LinkedList<Integer>());
			REgr.add(i, new LinkedList<Integer>());
		}
		for (int i=0; i<e; i++) {
			input = br.readLine().split(" ");
			int x = Integer.parseInt(input[0]);
			int y = Integer.parseInt(input[1]);
			gr.get(x).add(y);
			REgr.get(y).add(x);
		}
		


		//dfs1
		for (int i=1; i<=n; i++) {
			if (!visit[i]) dfs1(i);
		}
		
		Arrays.fill(visit, false);
		
		curComp = 0;
		numNodes = 1;
		while(!st.isEmpty()) {
			int u = st.pop();
			if (!visit[u]) {
				dfs2(u);
			
				comp[u][1] = numNodes-1;
				curComp++;
				numNodes=1;
			}
		}
		
		
		for (int k=1; k<=n; k++) {
			if (comp[k][1] > 1) {
				System.out.println(1);
			}
			else System.out.println(0);
		}
		
	}
	
	public static void dfs1 (int u) {
		visit[u] = true;
		
		// THIS AVOIDS NULLPOINTER BIIG BRAIN, arraylist avoids this, while map does not
		LinkedList<Integer> kids = gr.get(u);
		for (int kid : kids) {
			if (visit[kid] != true) {
				dfs1(kid);
			}
		}
		st.add(u);
	}

	public static void dfs2 (int u) {
		visit[u] = true;
		comp[u][0] = curComp;
		comp[u][1] = numNodes;
		numNodes++;
		
		LinkedList<Integer> kids = REgr.get(u);
		for (int kid : kids) {
			if (visit[kid] != true) {
				dfs2(kid);
			}
		}
	}
	
}
