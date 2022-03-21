import java.util.Scanner;

public class CCCJ4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String flips = scan.nextLine();
		scan.close();


		int[] spots = new int[4];
		spots[0] = 1; spots[1] = 2; spots[2] = 3; spots[3] = 4;
		
		for (int i=0; i<flips.length(); i++) {
			if (flips.charAt(i)=='H') {
				int temp0 = spots[0];
				int temp1 = spots[1];
				int temp2 = spots[2];
				int temp3 = spots[3];
				spots[0] = temp2;
				spots[1] = temp3;
				spots[2] = temp0;
				spots[3] = temp1;
			}
			if (flips.charAt(i)=='V') {
				int temp0 = spots[0];
				int temp1 = spots[1];
				int temp2 = spots[2];
				int temp3 = spots[3];
				spots[0] = temp1;
				spots[1] = temp0;
				spots[2] = temp3;
				spots[3] = temp2;
			}
		}
		
		System.out.println((spots[0]) + " " + (spots[1]) );
		System.out.println((spots[2]) + " " + (spots[3]) );

	}

}
