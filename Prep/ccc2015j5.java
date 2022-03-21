import java.util.Scanner;

public class ccc2015j5 {

	static int counter=0;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // pies
		int k = scan.nextInt(); // ppl
		scan.close();
		
		
		// n-k+1
		
		System.out.println(pies(n,k));
		System.out.println(counter);

	}
	
	public static int pies (int n, int k) {
		if (k==n) {
			return 1;
		}
		
		for (int i=1; i<(n-k+1); i++) {
			counter += pies(n-i,k-1);
		}
		
		return 0; //useless
	}

}
