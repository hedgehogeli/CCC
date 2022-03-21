import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class testBox {
	
	public static void main(String[] args) throws IOException {
	
		BufferedReader mReader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("number of teams?");
		int numTeams = Integer.parseInt(mReader.readLine());
		
		Queue<Integer> qu1 = new LinkedList<>();
		Queue<Integer> qu2 = new LinkedList<>();

		for (int i=1;i<=numTeams;i++) {
			qu1.add(i);
		}
		
		while (qu1.isEmpty()==false||qu2.isEmpty()==false) {
			if (qu1.size()==1) {
				System.out.println("winner: " + qu1.poll());
				break;
			}
			if (qu2.size()==1) {
				System.out.println("winner: " + qu2.poll());
				break;
			}
			//====
			while (!qu1.isEmpty()) {
				System.out.println("Team " + qu1.poll() + 
						" vs " + qu1.poll() + " , enter who wins:");
				qu2.add(Integer.parseInt(mReader.readLine()));
			}
			//====
			if (qu1.size()==1) {
				System.out.println("winner: " + qu1.poll());
				break;
			}
			if (qu2.size()==1) {
				System.out.println("winner: " + qu2.poll());
				break;
			}
			//=====
			while (!qu2.isEmpty()) {
				System.out.println("Team " + qu2.poll() + 
						" vs " + qu2.poll() + " , enter who wins:");
				qu1.add(Integer.parseInt(mReader.readLine()));
			}
			
		}
		
		
		
	}
	
}