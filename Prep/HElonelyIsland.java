import java.util.*;
import java.io.*;

/*
* COMMENTS:
* https://www.hackerearth.com/practice/algorithms/graphs/topological-sort/practice-problems/algorithm/lonelyisland-49054110/
* toplogical sort:
*/

public class HElonelyIsland {

	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int islands = scan.nextInt();
		int bridges = scan.nextInt();
		int startIndex = scan.nextInt();
		
		Map<Integer, LinkedList<Integer>> graph = new HashMap<>();
		boolean[] visited = new boolean[islands+1];
		
		for (int i=0;i<bridges;i++) { // 1 direct adj list
			int x = scan.nextInt();
			int y = scan.nextInt();
			if (!graph.containsKey(x) ) {
				LinkedList<Integer> temp = new LinkedList<>();
				graph.put(x,temp);
			}
			graph.get(x).add(y);
		}
		
		//creation of associated probability, index1
		Double[] prob = new Double[islands+1];
		
		
		Queue<Integer> qu = new LinkedList<>();
		qu.add(startIndex);
		while (!qu.isEmpty()) {
			
			int cur = qu.poll();
			visited[cur] = true;
			LinkedList<Integer> kids = graph.get(cur);
			int size = kids.size();
			if (kids == null) {
				
			}
			else {
			for (int kid:kids) {
				
				prob[kid] = prob[kid] + 1/size;
				if (visited[cur] == false) {
					qu.add(kid);
				}
			
			}
			}
			
		}
		
		
		for (int i=1; i<=islands; i++) {
			System.out.println(i + " " + prob[i]);
		}

	}

}



