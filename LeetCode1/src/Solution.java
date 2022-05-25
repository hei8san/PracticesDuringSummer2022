import java.util.HashMap;
import java.util.Map;

public class Solution {
//	public int[] twoSum(int[] nums, int target) {
//		long targetLong = target;
//		int firstIndex = -1;
//		int secondIndex = -1;
//		
//		long[] memo = new long[nums.length];
//
//		for (int i = 0; i < nums.length-1; i++) {
//			for (int j = i + 1; j < nums.length; j++) {
//				if(nums[i] + nums[j] == targetLong) {
//					firstIndex = i;
//					secondIndex = j;
//				}
//			}
//		}
//		
//		int[] ans = new int[2];
//		ans[0] = firstIndex;
//		ans[1] = secondIndex;
//		return ans;
//
//	}
	
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> hash = new HashMap<>();
		
		for (int i = 0 ; i < nums.length; i++) {
			int complement = target - nums[i];
			
			if(hash.containsKey(complement)) {
				return new int[] {hash.get(complement), i};
			}
			
			hash.put(nums[i], i);
		}
		throw new IllegalArgumentException();
	}
	
	
	public int[] twoSumTest(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>(); //Key(element), Value(index)
		int ans[] = new int[2];
		for(int i  = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if(map.containsKey(complement)) {
				ans[0] = map.get(complement);
				ans[1] = i;
			} else {
				map.put(nums[i], i);
				System.out.println(map.toString());
			}
			
		}
		
		return ans;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
