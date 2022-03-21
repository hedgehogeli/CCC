import java.util.Scanner;

public class Exercise2 {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int votes = scan.nextInt();
		scan.nextLine();
		String voteAB = scan.nextLine();
		scan.close();
		int numA = 0, numB = 0;
		for (int i=0;i<votes;i++) {
			switch (voteAB.substring(i,i+1)) {
				case "A":
					numA++;
					break;
				case "B":
					numB++;
					break;
			}
		}
		if (numA==numB) {
			System.out.println("Tie");
		}
		else {
			if (numA>numB) {
				System.out.println("A");
			}
			else {
				if (numB>numA) {
					System.out.println("B");
				}
			}
		}
	}
}
