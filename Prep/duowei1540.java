import java.io.IOException;
import java.util.Scanner;

public class duowei1540 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(recursion8(a,b));
	}
	
	public static int recursion8 (int a, int b) {
		int min = 999999;
		if (a==b) {
			return 0;
		}
		else {
			
			for (int k=1;k<(a/2);k++) {
				int x1 = recursion8(k, b);
				int y1 = recursion8(a-k,b);
				if (min> (x1+y1)) min = x1+y1;
			}
				
			for (int k=1;k<(b/2);k++) {
				int x1 = recursion8(a, k);
				int y1 = recursion8(b-k,a);
				if (min> (x1+y1)) min = x1+y1;
			}
			return min+1;
		}
		
		
	}

}
