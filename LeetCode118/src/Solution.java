public class Solution {

	
//	public List<List<Integer>> generate(int numRows) {
//		List<List<Integer>> ans = new LinkedList<List<Integer>>();
//		
//		for (int row = 0; row < numRows; row++) {
//			
//			List<Integer> temp = new LinkedList<>();
//			
//			for (int col = 0; col < row + 1; col++) {
//				System.out.println("row: "+ row+" col: "+ col);
//				System.out.println(factorial(row) + "/" +factorial(row-col)*factorial(col));
//				temp.add(col, Math.toIntExact(factorial(row)/(factorial(row-col)*factorial(col))));
//				
//			}
//			ans.add(row,temp);
//		}
//		return ans;
//	}
//
//	public long factorial(int n) {
//	    return LongStream.rangeClosed(1, n)
//	        .reduce(1, (long x, long y) -> x * y);
//	}
}
