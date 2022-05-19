import java.util.ArrayList;
import java.util.List;

public class Solution {

	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> ans = new ArrayList<>();
		
		if(numRows == 0) return ans;
		
		List<Integer> first_row = new ArrayList<>();
		first_row.add(1);
		ans.add(first_row);
		
		for(int i = 1; i < numRows; i++) {
			List<Integer> prev_row = ans.get(i-1);
			List<Integer> current_row = new ArrayList<>();
			
			current_row.add(1);
			for(int j = 1; j < i; j++) {
				current_row.add(prev_row.get(j-1) + prev_row.get(j));
				
			}
			current_row.add(1);
			ans.add(current_row);
		}
		return ans;
		
	}
	
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
