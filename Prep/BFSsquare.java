import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFSsquare {
	
	public static void main(String[] args) {
		System.out.println("input left-->right, top-->down; denote empty box w/ 9");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(decode(987654321));
		
//		String temp="";
//		for (int i=0;i<9;i++) {
//			temp = temp + scan.nextInt();
//		}
//		int input = Integer.parseInt(temp);
//		scan.close();
		
		

	}
	// 1 2 3 
	// 4 5 6 
	// 7 8 9
	
	public static int encode(int[][] input) {
		int num = 0;
		for (int i=0;i<3;i++) {
			for (int k=0;k<3;k++) {
				num=num*10 + input[i][k];
			}
		}
		return num;
	}
	
	public static int[][] decode(int input) {
		int temp = 1;
		int[][] state = new int[3][3];
		for (int i=0;i<3;i++) {
			for (int k=0;k<3;k++) {
				state[i][k] = input%(temp*10)/temp;
			}
		}
		
		return state;
	}
	
	public ArrayList<Integer> genKids(int[][] state) {
		ArrayList<Integer> list = new ArrayList<>();
		if( state[0][0] == 9) {
			int temp = state[0][0];
			state [0][0] = state[0][1];
			state[0][1] = temp;
			list.add(encode(state));
			
			state[0][1] = state[0][0];
			state[0][0] = temp;
			
			state[0][0] = state[1][0];
			state[1][0] = temp;
			list.add(encode(state));
		}
		
		if( state[2][0] == 9) {
			int temp = state[2][0];
			state [2][0] = state[1][0];
			state[1][0] = temp;
			list.add(encode(state));
			
			state[1][0] = state[2][0];
			state[2][0] = temp;
			
			state[2][0] = state[2][1];
			state[2][1] = temp;
			list.add(encode(state));
		}
		
		
		//continue after this fml
		if( state[0][2] == 9) {
			int temp = state[0][0];
			state [0][0] = state[0][1];
			state[0][1] = temp;
			list.add(encode(state));
			
			state[0][1] = state[0][0];
			state[0][0] = temp;
			
			state[0][0] = state[1][0];
			state[1][0] = temp;
			list.add(encode(state));
			
		}
		
		if( state[2][2] == 9) {
			int temp = state[0][0];
			state [0][0] = state[0][1];
			state[0][1] = temp;
			list.add(encode(state));
			
			state[0][1] = state[0][0];
			state[0][0] = temp;
			
			state[0][0] = state[1][0];
			state[1][0] = temp;
			list.add(encode(state));
			
		}
		
		
		return list;
	}
	
	public void bfs() {
		Queue<Integer> qu = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<Integer>(); 
		//		qu.add(coding(FIRST STATE));
		int steps = 0;
		
		while (!qu.isEmpty()) {
			int size = qu.size();
			for (int k=0;k<size;k++) {
				int curState = qu.poll();
				ArrayList<Integer> kids = genKids(decode(curState));
				for (int kid:kids) {
					if (kid==target) {System.out.println("found"); return; }
					if (!visited.contains(kid)) {
						visited.add(kid); 
						qu.add(kid);
						}
					
				}
			}
			
		}
	}
	
}
