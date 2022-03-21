import java.io.IOException;
import java.util.Scanner;

public class ccc2019s3 {

	// weird magic square thing
	
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		
		int[][] ffs = new int[3][3];
		ffs[0][0] = scan.nextInt(); ffs[0][1] = scan.nextInt(); ffs[0][2] = scan.nextInt();
		ffs[1][0] = scan.nextInt(); ffs[1][1] = scan.nextInt(); ffs[1][2] = scan.nextInt();
		ffs[2][0] = scan.nextInt(); ffs[2][1] = scan.nextInt(); ffs[2][2] = scan.nextInt();
		scan.close();
		
		// ARRAY WORKS AS IN [ROW][COLUMN]
		
	}
	
	public static int[][] ezcheck (int[][] input) {
		
		
		
	}
	
//	public static int[][] thrucheck (int[][] input) {
//		
//		
//		
//	}
	
	
	public static int isInt (String input) {
		return Integer.parseInt(input);
	}

}
