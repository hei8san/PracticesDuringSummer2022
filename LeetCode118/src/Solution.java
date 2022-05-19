import java.util.LinkedList;
import java.util.List;

public class Solution {
	public List<List<Integer>> generate(int numRows) {// ArrayList linkedlist 試す
		List<List<Integer>> ans = new LinkedList<List<Integer>>();

		for (int row = numRows-1; row == 0; row--) {
			List<Integer> temp = new LinkedList<>();
			System.out.println(row);
			for (int col = row; col == 0; col--) {
				temp.add(col, factorial(row)/factorial(row-col)*factorial(col));
				
			}
			ans.add(row,temp);
		}
		return ans;
	}

	public int factorial(int i) {
		if (i == 0)
			return 1;
		return i * factorial(i - 1);

	}
}
