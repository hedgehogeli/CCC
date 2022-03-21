import java.util.Scanner;

public class CCCJ2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rounds = scan.nextInt();
		scan.nextLine();
		String[] inputstr = new String[rounds];
		int[] inputint = new int[rounds];
		
		for (int i=0; i<(rounds); i++) {
			String[] sections = scan.nextLine().split(" ");
			inputint[i] = Integer.parseInt(sections[0]);
			inputstr[i] = sections[1];
		}

		scan.close();
		
		for (int o=0; o<rounds; o++) {
			int temp = inputint[o];
			
			for (int i=0; i<temp; i++) {
				System.out.print(inputstr[o]);
			}
			System.out.println();
		}
		
	}

}