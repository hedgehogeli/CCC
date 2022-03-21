import java.util.Scanner;

public class duowei1115 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); scan.close();
		
		System.out.println(sumNum(2,n));
		
		//
		//
		//
		
	}
	
	public static int sumNum(int digits, int n) {
		if (digits == n) return 1;
	//	if (n==1) return 1;
		
		
		return sumNum(digits+1, n);
		
	}

}
