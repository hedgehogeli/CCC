import java.util.*;
import java.io.*;

/*
* COMMENTS:    
*/

public class testBox {
	
	static Map<Integer, LinkedList<Integer>> graph = new HashMap<>();
	static Map<Integer, LinkedList<Integer>> revgraph = new HashMap<>();
	static boolean[] visited, used;
	static Stack<Integer> order = new Stack<>();
	static Stack<Integer> component = new Stack<>();
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		visited = new boolean[n+1];
		used = new boolean[n+1];
		
		int e = scan.nextInt();
		
		//taking input
		for (int i=0; i<e; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			// normal graph
			if (!graph.containsKey(x) ) {
				LinkedList<Integer> temp = new LinkedList<>();
				graph.put(x,temp);
			}
			graph.get(x).add(y);
			
			//reversed graph
			if (!graph.containsKey(y) ) {
				LinkedList<Integer> temp = new LinkedList<>();
				graph.put(y,temp);
			}
			graph.get(y).add(x);
		}  // SO USE REVGRAPH YOU FUCKING DEGENERATE
		
		dfs1(1);
		// run standard DFS on original graph on random node?
		// if there are possible different islands/groups/components of nodes then run dfs on all
		
		// reuse visited:
		Arrays.fill(visited, false);
		
		while (!order.isEmpty()) {
			int v = order.pop();
			if (visited[v] == false) {
				dfs2(v);
				
				for (int i:component) {
					System.out.print(i);
				}
				System.out.println("cl");
				component.clear();
			}
		}
		
		
		
		
	}
	
	public static void dfs1(int node) {
		visited[node] = true;
		for (int kid : graph.get(node)) {
			if (visited[kid] == false) {
				dfs1(kid);
			}
		}
		//System.out.println(node + " done");
		order.push(node);
	}
	
	public static void dfs2(int node) {
		visited[node] = true;
		component.push(node);
//		if (graph.get(node)==null) component.push(0);
		for (int kid : graph.get(node)) {  // I THINK I NEED REV GRAPH HERE
			if (visited[kid] == false) {
				dfs2(kid);
			}
		}
	}
	
}


/*
input:
8
14
1 2
3 1
2 3
2 4
3 4
2 6
6 5
4 5
5 4
6 7
7 6
7 8
8 7
8 5
output:
1 2 3
4 5
6 7 8
3 SCC


C++ code:

 vector < vector<int> > g, gr;    //in Java ArrayList< LinkedList<Integer> > g , gr;
    vector<bool> used;
    vector<int> order, component;  //if use java: Stack<Integer> order ....

    void dfs1 (int v) {     //this is very similar to DAG DFS algorithm...
        used[v] = true;
        for (size_t i=0; i<g[v].size(); ++i){
            if (!used[ g[v][i] ])
                dfs1 (g[v][i]);
	}
        order.push_back (v);  //finish time of v  (all sub-tree within v is done!)
    }
    void dfs2 (int v) {
        used[v] = true;
        //component.push_back (v);
        comp[v] = component;
	for (size_t i=0; i<gr[v].size(); ++i)
            if (!used[ gr[v][i] ])
                dfs2 (gr[v][i]);
    }
 int main() {
        int n;
        ... reading n ...
        for (;;) {
            int a, b;
            ... reading next edge (a,b) ...
            g[a].push_back (b);             //for original graph
            gr[b].push_back (a);            // for reverse graph
        }
        used.assign (n, false); 
        for (int i=0; i<n; ++i){         //do DFS on original graph, used[i] is actually visited array
            if (!used[i]) { dfs1 (i); }
	}
        used.assign (n, false);
        //for (int i=0; i<n; ++i) {
          //  int v = order[n-1-i];

	int component = 0;
        while( !order.isEmpty() ){    
	    int v = order.pop();
            if (!used[v]) {
                dfs2 (v);
                //... printing next component ...
                //component.clear();
		component++;
            }
        }
    }

 */

