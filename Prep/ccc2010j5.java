import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ccc2010j5 {

	static int[][] table = new int[8][8];
	
	static int[] moves = {8, 19, 21, 12, -12, -8, -19, -21};
	
	public static int move(int start, int end) {
		Queue<Integer> qu = new LinkedList<Integer>();
		int step = 0;
		qu.add(start);
		
		while (!qu.isEmpty()) {
			int size = qu.size();
			for (int i=0;i<size;i++) {
				int current = qu.poll();
				if (current == end) {
					return step;
				}
				if (current%10<=8&&current%10>=1&&current/10<=8&&current/10>=1) {
			//		int x=current/10;
			//		int y=current%10;
			//		for (int k=0;k<moves.length;k++) {
			//			q.add( (x+moves[]))
					for (int j: moves) {
						qu.add(current+j);
					}	
				}
			}
			step++;
		}
		return -1;
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt(), b = scan.nextInt();
		
		int start = a*10 + b;
		
		int x=scan.nextInt(), y=scan.nextInt(); //target
		
		int end = 10*x + y;
		
		System.out.println(move(start,end));
		
		System.out.println(ree(start,end));
		
		
	}
	
	public static int ree(int start, int target) {
		
		// GENNING KIDS
		Queue<Integer> list = new LinkedList<>();
		int x = start/10;
		int y = start%10;
		list.add((x+1)*10+(y+2));
		list.add((x+2)*10+(y+1));
		list.add((x+2)*10+(y-1));
		list.add((x+1)*10+(y-2));
		list.add((x-1)*10+(y-2));
		list.add((x-2)*10+(y-1));
		list.add((x-2)*10+(y+1));
		list.add((x-1)*10+(y+2));
		int count =0;
		int temp = 0;
		
		
		while (!list.isEmpty()) {
			temp = list.poll();
			if (temp/10<=8&&temp/10>=1&&temp%10<=8&&temp%10>=1) {
				list.add(temp);
			}
		
			count++;
			if (count==8) break;
		}
		
		
		
	}

}
