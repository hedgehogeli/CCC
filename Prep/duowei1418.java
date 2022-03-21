import java.util.Scanner;

public class duowei1418 {

	// USE SOMETHING LIKE A LINKEDLIST OR QUEUE TO REDUCE BRUTE FORCING THE SIDES
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt(); int y = scan.nextInt(); scan.nextLine();
		
		String input="";
		int col=0;
		
		String[][] arr = new String[x][y];
		
		for (int row=0;row<x;row++) {
			input = scan.nextLine();
			for (int ch=0;ch<y-1;ch++) {
				if (!input.substring(ch,ch+1).equals(" ")) {
					arr[row][col] = input.substring(ch,ch+1);
					col++;
				}
			}
		}
		
		System.out.println(arr[1][2] + " " + arr[3][4]);
		
		
	}

}
