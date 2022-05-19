public class Main {

	public static void main(String[] args) {
		int[][] mat = {{1,2},{3,4}};
		int r = 1, c= 4;
		Solution solution  = new Solution();
		int[][] ans = solution.matrixReshape(mat, r, c);
		for(int i = 0; i < ans.length; i++) {
			for(int j = 0; j < ans[i][j]; j++) {
				System.out.print(ans[i][j]);
			}
			System.out.println();
		}
		

	}

}
