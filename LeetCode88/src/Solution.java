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
	
	
	public void mergeTest(int[] nums1, int m, int[] nums2, int n) {
		if(n == 0) return; 
		
		int size = n+m-1;
		int nums1L = m-1;
		int nums2L = n-1;
		
		
		while(nums2L >= 0) {
			
			if(nums1L >= 0 && nums1[nums1L] < nums2[nums2L]) {
				nums1[size] = nums2[nums2L];
				nums2L--;
				size--;
			}else if(nums1L >= 0 &&nums1[nums1L] > nums2[nums2L]) {
				nums1[size] = nums1[nums1L];
				nums1[nums1L] = 0;
				size--;
				nums1L--;
			}else {
				nums1[size] = nums2[nums2L];
				nums2L--;
				size--;
			}
			
			
		}
		System.out.println(Arrays.toString(nums1));
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
