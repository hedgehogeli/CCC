import java.io.*;
import java.util.*;

public class shuffle {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); scan.nextLine();
		int[] assignTo = new int[n];
		int[] input = new int[n];
		for(int i = 0; i < n; i++) {
			assignTo[i] = scan.nextInt()-1;
			input[assignTo[i]]++;
		}
		
		int ret = n;
		Queue<Integer> qu = new LinkedList<Integer>();
		
		for(int i = 0; i < n; i++) {
			if(input[i] == 0) {
				qu.add(i);
				ret--;
			}
		}
		while(!qu.isEmpty()) {
			int curr = qu.poll();
			if(--input[assignTo[curr]] == 0) {
				qu.add(assignTo[curr]);
				ret--;
			}
		}
		System.out.println(ret);
		scan.close();
	}
}