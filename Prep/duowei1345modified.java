import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class duowei1345modified {
	
	//ONLY FOR TWO CUPS
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int volA = scan.nextInt(), volB = scan.nextInt(), n = scan.nextInt(); 
		scan.close();
		
		boolean[] visited = new boolean[code((volA+1),(volB+1))];
		Queue<Integer> qu = new LinkedList<>();
		int state = code(0,0);
		qu.add(state);
		visited[state] = true;
		int steps = 0;
		
		while (!qu.isEmpty()) {
			int size = qu.size();
			steps++;
			if (steps<30) { System.out.println("not found, -1"); break;}
			for (int i=0;i<size;i++) {
				int curstate = qu.poll();
				ArrayList<Integer> kids = generateKids(curstate/100,curstate%100, volA, volB);
				for(int kid : kids) {
					if (!visited[kid]) {visited[kid]=true; qu.add(kid);}
					if (kid/100==n || kid%100==n) {
						System.out.println("found in " + steps );
						return;
					}
				}
			}
		}
		
	}

	public static ArrayList<Integer> generateKids(int x, int y, int volA, int volB) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(code(0,y)); //emptying
		list.add(code(x,0));
		list.add(code(volA,y)); //filling
		list.add(code(x,volB));
		//b to a
		if ((x+y)>volA) {
			list.add(code(volA,x+y-volA)); }
		else {
			list.add(code(x+y, 0));}
		//a to b
				if ((x+y)>volB) {
					list.add(code(x+y-volB, volB)); }
				else {
					list.add(code(0, x+y));}
				
		return list;
	}


	public static int code(int x, int y) 
	{return x*100 + y;}
	
	
}