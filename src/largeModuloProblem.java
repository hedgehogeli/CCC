import java.util.*;
import java.io.*;

/*
* COMMENTS:
*/

public class largeModuloProblem {

	public static void main(String[] args) {
		//question: sum 27^n + 27^n-1 + ... + 27^1 + 27^0
		
				int n = 100 + 1;
				int mod = 100000007;
				
				// looking at 27^101 / 26    % 10000007
				long sum = recursePowerMod(27L,n,mod) / 26L;
				//2147483647
				
			 	System.out.println(sum);

	}
	
	public static long recursePowerMod (long input, int pow, long mod) {
		if (pow == 1) {
			return input;
		}
		return recursePowerMod(((input%mod)*(input%mod))%mod, pow-1, mod);
	}

}



