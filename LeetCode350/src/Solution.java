import java.util.Arrays;

public class Solution {
	public int[] intersect(int[] nums1, int[] nums2) {
		int length1 = nums1.length;
		int length2 = nums2.length;
		int[] ans = new int[length1 + length2];
		int i = 0, j = 0, k = 0;
		
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		
		while(i < length1 && j < length2) {//indexOutOfBoundを避けるため
			if(nums1[i] < nums2[j]) {
				i++;
			}
			else if (nums1[i] > nums2[j]) {
				j++;
			} else {// nums1[i] == nums2[j] の場合
				ans[k++] = nums1[i++]; // ansに要素を入れて
				j++;
			}
		}
		return Arrays.copyOfRange(ans, 0, k);// 最初からkまでの配列を帰す
	}

}
