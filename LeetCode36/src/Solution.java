import java.util.HashSet;
import java.util.Set;

public class Solution {
//	public boolean isValidSudoku(char[][] board) {
//		boolean ans = true;
//		for (int i = 0; i < board.length; i++) {
//			Set<Integer> rowMap = new HashSet<>();
//			for (int j = 0; j < board[i].length; j++) {
//				if (rowMap.contains(Character.getNumericValue(board[i][j]))) {
//
//					return false;
//				} else {
//					rowMap.add(Character.getNumericValue(board[i][j]));
//				}
//			}
//		}
//		int bR = 0;
//		int row = 3;
//		int bC = 0;
//		int col = 3;
//		int count = 0;
//		do {
//			for (int i = bR; i < row; i++) {
//				
//				for (int j = bC; j < col; j++) {
//					
//				}
//				
//			}
//			count++;
//			if(count%3 == 0) {
//				bR
//			}
//		}while(count < 9);
//		
//		
//	}

	public boolean isValidSudoku(char[][] board) {
		Set<String> seen = new HashSet<>();
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				char current_val = board[i][j];
				if (current_val != '.') {// if each mass contains value
					if (!seen.add(current_val + " found in row " + i)
							|| !seen.add(current_val + " found in column " + j)
							|| !seen.add(current_val + " found in sub box " + i / 3 + "-" + j / 3)) {// if the element
																										// is already
																										// contaitned in
																										// the HashSet
						return false;
					}

				}

			}
		}
		return true;

	}
}
