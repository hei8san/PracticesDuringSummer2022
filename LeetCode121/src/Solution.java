public class Solution {
	public int maxProfit(int[] prices) {
		int minimumPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		int minimumIndex = 0;

		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < minimumPrice) {
				minimumPrice = prices[i];

			} else {
				int profit = prices[i] - minimumPrice;
				maxProfit = Math.max(maxProfit, profit);
			}
		}
		return maxProfit;
	}

//	public int maxProfit(int[] prices) { //Brute Force
//		int maxProfit = 0;
//		
//		for(int i = 0; i < prices.length -1; i++) {
//			for(int j = i + 1; j < prices.length; j++) {
//				int tempProfit = prices[j] - prices[i];
//				maxProfit = Math.max(maxProfit, tempProfit);
//			}
//		}
//		return maxProfit;
//	}

	public int consecutiveSum(int[] nums, int k) {
		// https://www.geeksforgeeks.org/window-sliding-technique/
		int maxSum = 0;

		int length = nums.length;

		for (int i = 0; i < k; i++) {
			maxSum += nums[i];
			// initial sum == maxSum
		}
		int windowSum = maxSum;
		// maxSum and windowSum are same at first

		for (int i = k; i < length; i++) {
			windowSum += nums[i] - nums[i - k];
			maxSum = Math.max(maxSum, windowSum);

		}

		return maxSum;
	}

	
}
