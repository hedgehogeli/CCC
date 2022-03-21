import java.util.Scanner;

public class duowei1478 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int length=0;
		String input = "";
		while (scan.hasNext()) {
			input = scan.nextLine();
			length = input.length(); 
			for ()
		}
		
		
		
	}

	public static int floorFlush (char[][] board, int row, int col, int m, int n) {
		if (row<0 || col<0 || row>=m || col >=n) return 0;
		
		if (board[row][col]=='L') return 0;
		if (board[row][col]=='V') return 0;
		
		board[row][col]='V';
		
		int total = 1;
		
		total+= floorFlush(row+1,col);
		total+= floorFlush(row+1,col-1);
		total+= floorFlush(row+1,col+1);
		total+= floorFlush(row,col+1);
		total+= floorFlush(row,col-1);
		total+= floorFlush(row-1,col);
		total+= floorFlush(row-1,col-1);
		total+= floorFlush(row-1,col+1);

		return total;
		
		
	}
	
	
}
