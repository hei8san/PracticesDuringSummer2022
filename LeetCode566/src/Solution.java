
public class Solution {
	public int[][] matrixReshape(int[][] mat, int r, int c) {

		int m = mat.length;
		int n = mat[0].length;

		if (m * n != r * c)
			return mat;// もし引数のサイズと出力するサイズが合わないとき

		int[][] ans = new int[r][c];
		int row_ans = 0; // 出力用の行
		int col_ans = 0; // 出力用の列
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				ans[row_ans][col_ans] = mat[i][j];

				col_ans++;

				if (col_ans == c) {
					col_ans = 0;
					row_ans++;
				}

			}

		}

		return ans;

	}
}
