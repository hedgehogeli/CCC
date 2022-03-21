import java.util.Scanner;

public class duowei1545 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cowNum = scan.nextInt(); scan.nextLine();
		
		Integer[] shufflePos = new Integer[cowNum];
		for (int i=0;i<cowNum;i++) {
			shufflePos[i] = scan.nextInt();
		}
		
		
		
		int a=0;
		for (int i=0;i<cowNum;i++) {
			if (shufflePos[i] == i) {
			a++;
			}
		}
		
		
		
		

	}

}
