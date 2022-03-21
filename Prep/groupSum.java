public class groupSum {

	/**
	 *  ARGGHGHGHGHGHGHGG
	 */
	public static void main(String[] args) {


		

	}
	
	public boolean groupSum(int start, int[] nums, int target) {
		  if (start>=nums.length) return false;
		  if (target==0) return true; 
		  
		  int k = target - nums[start];
		  
		  if (groupSum(start+1, nums, target)) {
		    return true;
		  }
		  
		  if (groupSum(start+1, nums, k) == true) return true;
		  else return false;

		  
		}


}
