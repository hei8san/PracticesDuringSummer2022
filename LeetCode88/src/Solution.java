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
		int p1 = m-1, p2 = n-1, i = m+n-1;
		
		while(p2 >=0) {
			if(p1 >= 0 && nums1[p1] > nums2[p2]) {
				nums1[i--] = nums1[p1--];
			}
			else {
				nums1[i--] = nums2[p2--];
			}
		}
	}

}
