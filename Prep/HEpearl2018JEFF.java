import java.util.*;
import java.io.*;

/*
* COMMENTS:
*/

public class HEpearl2018JEFF {
    
	public static class Edge{
        int a , w;
        public Edge(int a1, int w1){
            a=a1; w=w1;
        }
    }
 
    static ArrayList<LinkedList<Edge> > graph = new ArrayList<>();
    static int total = 0;
    static int[] path;
    static int N;
    static int[] H;
    static boolean[] visit;
    
    public static void main(String[] args){
    	
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        path = new int[N+1];
        H = new int[N+1];
        visit = new boolean[N+1];
        Arrays.fill(visit, false);
 
        for(int k=1; k<N+1; k++)
        { H[k] = sc.nextInt(); }
        
        for(int k=0; k<=N; k++){ graph.add(new LinkedList<Edge>() ); }
        for(int k=0; k<N-1; k++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int w = sc.nextInt();
            graph.get(x).add( new Edge(y,w) );
            graph.get(y).add( new Edge(x,w) );
            total += w;
        }  //finish the graph
        
        path[1] = 0;
        dfs(1, 0);
        int min = (1<<31)-1;   
        for(int k = 1; k<=N; k++){
            int P = 2*total - path[k] + H[k];
            if( min > P ) min = P;
           
        }
        System.out.println(min);
        sc.close();
    }
   
    public static void dfs(int u, int pa){
        visit[u] = true;
        LinkedList<Edge> cur = graph.get(u);
        for( Edge e : cur){
            if( !visit[e.a] && e.a != pa ){
                path[e.a] = path[u] + e.w;
                visit[e.a] = true;
                dfs(e.a, u);
            }
        }              
    }

}



