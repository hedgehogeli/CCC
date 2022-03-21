import java.util.Scanner;

public class MagicSquares {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[5][5];
		for (int row=1;row<5;row++) {
			for (int col=1;col<5;col++) {
				arr[row][col]=scan.nextInt();
			}
		}
		scan.close();
		
		int row1 = arr[1][1]+arr[1][2]+arr[1][3]+arr[1][4],
			row2 = arr[2][1]+arr[2][2]+arr[2][3]+arr[2][4],
			row3 = arr[3][1]+arr[3][2]+arr[3][3]+arr[3][4],
			row4 = arr[4][1]+arr[4][2]+arr[4][3]+arr[4][4];
		int col1 = arr[1][1]+arr[2][1]+arr[3][1]+arr[4][1],
			col2 = arr[1][2]+arr[2][2]+arr[3][2]+arr[4][2],
			col3 = arr[1][3]+arr[2][3]+arr[3][3]+arr[4][3],
			col4 = arr[1][4]+arr[2][4]+arr[3][4]+arr[4][4];
		if (row1==row2&&row2==row3&&row4==row3&&row4==col1&&
				col1==col2&&col2==col3&&col3==col4) {
			System.out.println("magic");
		}
		else {
			System.out.println("not magic");
		}
		
	}

}
