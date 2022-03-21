import java.util.Scanner;
public class Exercise3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rounds = scan.nextInt();
		scan.nextLine();
		int temp1, temp2, points1 = 0, points2 = 0;
		for (int i=0;i<rounds;i++) {
			String oof = scan.nextLine();
			temp1 = Integer.parseInt(oof.substring(0,1));
			temp2 = Integer.parseInt(oof.substring(2,3));
			if (temp1>temp2) {
				points2 = points2 + temp1;
			}
			if (temp1<temp2) {
				points1 = points1 + temp2;
			}
		}
		System.out.println(100-points1);
		System.out.println(100-points2);
		scan.close();
	}
}
