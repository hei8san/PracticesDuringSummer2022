import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[][] mat = {{1,2,3},{4,5,6}};
		int r = 3, c= 2;
		Solution solution  = new Solution();
		int[][] ans = solution.matrixReshape(mat, r, c);
		System.out.println(Arrays.deepToString(ans));
		

	}

}
