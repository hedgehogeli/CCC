import java.util.Scanner;

public class csesdicecombos {

	// KEEP IN MIND THAT DICE CAP OUT AT 6
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); scan.close();
		scan.close();
		
		int output = 0;
		
		for (int i=n;i>0;i--) {
			output += nCr(n-1,i-1); //3,3, 3,2, 3,1, 3,0 == 1 3 3 1
		}
		
		System.out.println(output);

		//4 should return 8
		
	}
	
	public static int nCr (int n, int r) {
		
		return (factorial(n)) / ( (factorial(r))*(factorial(n-r)) );
		
	}
	
	public static int factorial (int input) {
		if (input==0) return 1;
		
		int temp= 1;
		for (int i=input;i>1;i--) {
			temp = temp*i;
		}
		return temp;
	}
	

}
