import java.util.*;

public class fibonacciEfficiency {

	static int[] mem = new int[51];
	
	public static void main(String[] args) {
		Arrays.fill(mem, 0);
		
		System.out.println(fib(45));
	}
	
	static int fib(int n) {
		if(mem[n]>0) return mem[n];
		if(n==0||n==1) {mem[n]=1; return mem[n];}
		if(mem[n-1]<=0) mem[n-1] = (int) fib(n-1); 
		if(mem[n-2]<=0) mem[n-2] = (int) fib(n-2);
		mem[n]=mem[n-1]+mem[n-2];
		return mem[n];
	}

}
