
public class Solution {
public int[][] matrixReshape(int[][] mat, int r, int c) {
		
        
		int m = mat.length;
		int n = mat[0].length;

        if(m*n != r*c) return mat;

		int[][] ans = new int[r][c];
		int row_mat = 0;
		int col_mat = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				ans[row_mat][col_mat] = mat[i][j];

				col_mat++;

				if (col_mat == c) {
					col_mat = 0;
					row_mat++;
				}

			}

		}

		return ans;

	}
}
