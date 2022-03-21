import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class duowei1559 {

	public static void main(String[] args) throws IOException {
		BufferedReader mReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(mReader.readLine());
		String[] input = new String[n];
		input = mReader.readLine().split(" ");
		Integer[] ffs = new Integer[n];
		for (int i=0;i<n;i++) {
			ffs[i] = Integer.parseInt(input[i]);
		}
		Arrays.sort(ffs, Collections.reverseOrder());
		
		int a = ffs[0], b = ffs[1], c = ffs[n-2], d = ffs[n-1];
		
		int t1 = a*a+b*b;
		int t2 = a*a+d*d;
	//	int t3 = b*b+d*d;
		int t4 = d*d+c*c;
		
		if (t1>t2 && t1>t4) {
			System.out.println(b + " " + a + " " + t1);
		}
		if (t2>t1 && t2>t4) {
			System.out.println(d + " " + a + " " + t2);
		}
	//	if (t3>t2 && t3>t1 && t3>t4) {
	//		System.out.println(d + " " + b + " " + t3);
	//	}
		if (t4>t1 && t4>t2) {
			System.out.println(d + " " + c + " " + t4);
		}
		
	}

}
