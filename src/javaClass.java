public class javaClass {

	public static void main(String[] args) {
		
		System.out.println(findSum(100));

	}
	
	public static int findSum(int n) {
		if(n==1) return 1;
		return findSum(n-1)+n;
	}
	
	
	
	

}
