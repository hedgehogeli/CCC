import java.util.Scanner;

public class weirdSkaters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Long a = scan.nextLong();
		int c = a.intValue();
		int b = c%7;
		
		switch (b) {
		case 1:
			System.out.println("U");break;
		case 2:
			System.out.println("T");break;
		case 3:
			System.out.println("S");break;
		case 4:
			System.out.println("R");break;
		case 5:
			System.out.println("Q");break;
		case 6:
			System.out.println("P");break;
		case 7: 
			System.out.println("V");break;
		}
		
	}

}
