import java.util.LinkedList;
import java.util.List;
import java.util.stream.LongStream;

public class Solution {
//	public List<List<Integer>> generate(int numRows) {// ArrayList linkedlist 試す
//		List<List<Integer>> ans = new LinkedList<List<Integer>>();
//		
//		for (int row = numRows-1; row < 0; row--) {
//			
//			List<Integer> temp = new LinkedList<>();
//			
//			for (int col = row; col == 0; col--) {
//				temp.add(col, factorial(row)/factorial(row-col)*factorial(col));
//				
//			}
//			ans.add(row,temp);
//		}
//		return ans;
//	}
//
//	public int factorial(int i) {
//		if (i == 0)
//			return 1;
//		return i * factorial(i - 1);
//
//	}
	
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> ans = new LinkedList<List<Integer>>();
		
		for (int row = 0; row < numRows; row++) {
			
			List<Integer> temp = new LinkedList<>();
			
			for (int col = 0; col < row + 1; col++) {
				System.out.println("row: "+ row+" col: "+ col);
				System.out.println(factorial(row) + "/" +factorial(row-col)*factorial(col));
				temp.add(col, Math.toIntExact(factorial(row)/(factorial(row-col)*factorial(col))));
				
			}
			ans.add(row,temp);
		}
		return ans;
	}

	public long factorial(int n) {
	    return LongStream.rangeClosed(1, n)
	        .reduce(1, (long x, long y) -> x * y);
	}
}
