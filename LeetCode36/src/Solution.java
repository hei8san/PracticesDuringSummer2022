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
		 
		 for(int i = 0; i < 9; i++) {
			 Set<Character> setRow = new HashSet<>();
			 Set<Character> setCol = new HashSet<>();
			 for(int j = 0; j < 9; j++) {
				 if(setCol.contains(board[j][i])) {
					 return false;
				 }else {
					 setCol.add(board[j][i]);
				 }
				 if(setRow.contains(board[i][j])) {
					 return false;
				 }else {
					 setRow.add(board[i][j]);
				 }
			 }
		 }
	        
	    }
}
