import java.util.Scanner;
public class SpeshulDay {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {int month = scan.nextInt();
		int day = scan.nextInt();
		if (month==2 && day==18) {
			System.out.println("Special");
		}
		else if (month==2 && day<=17) {
			System.out.println("Before");
		}
		else if (month==2 && day>=19) {
			System.out.println("After");
		}
		if (month==1) {
			System.out.println("Before");
		}
		if (month>=3) {
			System.out.println("After");
		}
		scan.close();
		}
		catch (Exception e) {
			
		}
	}
}
