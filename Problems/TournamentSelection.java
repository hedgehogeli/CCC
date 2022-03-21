import java.util.Scanner;

public class TournamentSelection {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int win = 0;
		
		
		for (int i=0;i<6;i++) {
			if (scan.nextLine().equals("W")) {
				win++;
			}
		}
		
		scan.close();
		
		switch(win) {
		
		case 0: 
			System.out.println("-1"); break;
		case 1: 
			System.out.println("3"); break;
		case 2: 
			System.out.println("3"); break;
		case 3: 
			System.out.println("2"); break;
		case 4: 
			System.out.println("2"); break;
		case 5: 
			System.out.println("1"); break;
		case 6: 
			System.out.println("1"); break;
		
			
		}
		
		//int n = scan.nextInt();


	}

}
