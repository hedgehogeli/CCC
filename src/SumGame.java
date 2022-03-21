import java.util.Scanner;
public class SumGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int [] Swift = new int[n];
		int [] Sem = new int[n];
		
		int sumSwift = 0;
		int sumSem = 0;
		int res = 0;

		for (int i=0; i<n; i++)
			Swift[i] = sc.nextInt();

		for (int i=0; i<n; i++)
			Sem [i] = sc.nextInt();

		for (int i=0; i<n; i++) {
			sumSwift = sumSwift + Swift[i];
			sumSem = sumSem + Sem[i];

			if (sumSwift == sumSem)
				res = i+1;
		}

		System.out.println(res);
		sc.close();
	}
}