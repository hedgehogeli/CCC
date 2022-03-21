import java.util.Arrays;

public class powerNefficiency {

	static long[] mem = new long[61];
	
	public static void main(String[] args) {
		Arrays.fill(mem, 0);
		
		long startTime = System.nanoTime();
		//code ============
		System.out.println(powerN(60));
		//=============
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns"); 
		
		
		
	}
	
	public static long powerN(int n) {
	//	INEFFICIENT: TAKES LONGER
	//	if (n==1) return 2;
	//	return powerN(n-1)*2;
	
		if (mem[n]>0) return mem[n];
		if (n==1) {/*mem[1]=2;*/ return 2;} 
		if (mem[n-1]<=0) mem[n-1] = powerN(n-1);
		return mem[n-1]*2; 
		
		
		
	}

}
