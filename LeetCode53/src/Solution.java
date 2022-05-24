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
}
