import java.util.Arrays;

public class subSetSum {

	static int[] nums;
	static boolean[][] keepRe;
	
	public static void main(String[] args) {
		
		int n = 15; 
		int k = 100;
		
		keepRe = new boolean[n][k];
		for(int i=0;i<n;i++) {
			Arrays.fill(keepRe[i], -1);
		}
		
	}
	
	public static boolean groupSum(int start, int target) {
		
		if(target==0) return true;
		
		if (start>=nums.length) return false;
		if(keepRe[start][target]>-1) return keepRe[start][target]==1;
		
		boolean re = groupSum(start+1, target);
		keepRe[start+1][target] = re;
		if (re) return true;
		if(target-nums[start]<0) return false;
		re = groupSum(start+1, target-nums[start]);
		keepRe[start+1][target] = re;
		return re;
		
		
	}

}
