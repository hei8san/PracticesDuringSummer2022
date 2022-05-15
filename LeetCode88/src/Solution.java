import java.util.Arrays;

public class Solution {
//	public void merge(int[] nums1, int m, int[] nums2, int n) {
//		int[] combinedArray = new int[m + n];
//		int index = 0;
//		for (int i = 0; i < m; i++) {
//			combinedArray[i] = nums1[i];
//			index++;
//			
//		}
//		for (int i = 0; i < n; i++) {
//			combinedArray[index] = nums2[i];
//			index++;
//			
//		}
//		Arrays.sort(combinedArray);
//		for(int i = 0; i < m+n; i++) {
//			nums1[i] = combinedArray[i];
//		}
//		
//		System.out.println(Arrays.toString(nums1));
//
//	}

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int nums1Length = m - 1; // 配列nums1の長さ
		int nums2Length = n - 1; //　配列nums2の長さ
		int index = m + n - 1; //　nums1, nums2を合わせた配列の長さ

		while (nums2Length >= 0) {
			if (nums1Length >= 0 && nums1[nums1Length] > nums2[nums2Length]) {
				nums1[index--] = nums1[nums1Length--];
				//index--;
				
			} else {
				nums1[index--] = nums2[nums2Length--];
				//index--;
			}
			System.out.println(Arrays.toString(nums1));
		}
	}

}
