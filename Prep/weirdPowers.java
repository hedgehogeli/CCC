import java.util.Scanner;

public class weirdPowers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		String b = scan.nextLine();
		
		
		int x = Integer.parseInt(a.substring(a.length()-1, a.length()));
		Long y = Long.parseLong(b);
		
		switch (x) {
		case 1:
			System.out.println(1); break;
		case 2: 
			long temp = y%5;
			
		case 3:
			
			
		}
		
	}

}
