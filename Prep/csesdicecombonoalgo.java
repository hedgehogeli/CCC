import java.util.Scanner;

public class csesdicecombonoalgo {

	//7 should be 63!!!!!!!
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); scan.close();
		scan.close();
		
		System.out.println(recurse(n));
		
	}
	
	public static int recurse(int input) {
		if (input <= 6) {
			return (int)(Math.pow(2, input-1));
		}
		
		return recurse(input-6)+recurse(input-5)+recurse(input-4)+
				recurse(input-3)+recurse(input-2)+recurse(input-1);
	
		
		
	}
	
	

}
