public class Solution {
	public int maxSubArray(int nums[]) {
		int ans = nums[0];
		int[] sumArray = new int[nums.length];
		sumArray[0] = nums[0];

		for (int i = 1; i < nums.length; i++) {
			sumArray[i] = Math.max(nums[i], sumArray[i - 1] + nums[i]);
			//System.out.println(Arrays.toString(sumArray));
			ans = Math.max(ans, sumArray[i]);
		}

		return ans;
	}
	
	
	
	public int maxSubArrayTest(int nums[]) {
		int size = nums.length;
		int[] memo = new int[size];
		int largestTempSum = 0;
		int ans = Integer.MIN_VALUE;
		for (int i = 0; i < size; i++) {

			largestTempSum += nums[i];
			if (largestTempSum < nums[i]) {
				memo[i] = nums[i];
				largestTempSum = nums[i];
			} else {
				memo[i] = largestTempSum;
			}
			ans = Math.max(ans, memo[i]);
		}
		//System.out.println(Arrays.toString(memo));
		return ans;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
