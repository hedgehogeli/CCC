import java.util.Scanner;

public class CCCJ1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int aa = scan.nextInt()*3;
		int ab = scan.nextInt()*2;
		int ac = scan.nextInt()*1;
		int ba = scan.nextInt()*3;
		int bb = scan.nextInt()*2;
		int bc = scan.nextInt()*1;
		scan.close();
		int a = aa+ab+ac, b = ba+bb+bc;
		
		if (a>b) {
			System.out.println("A");
		}
		else if (a<b) {
			System.out.println("B");
		}
		else if (a==b) {
			System.out.println("T");
		}
		
	}

}