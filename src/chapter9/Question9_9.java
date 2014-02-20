package chapter9;
import java.util.*;
public class Question9_9 {

	/**
	 * @param args
	 * Write a algorithm to print all ways of arranging eight queens on
	 * an 8*8 chess board so that none of them share the same row, column
	 * or digonal. In this case, "diagonal" means all diagonals, not just
	 * that bisect the board.
	 */
	
	private static int GRID_SIZE = 8;
	
	public static ArrayList<int[]> eightQueen(){
		int[] board = new int[GRID_SIZE];
		ArrayList<int[]> result = new ArrayList<int[]>();
		eightQueenRec(0,board,result);
		return result;
	}
	
	//multiple results. one list is one result.
	public static void eightQueenRec(int row, int[] board,ArrayList<int[]> result){
		if (row == GRID_SIZE){
			result.add(board.clone());
		}
		for (int i=0; i<GRID_SIZE; i++){
			if (checkBoard(row,i,board)){
				board[row] = i;
				eightQueenRec(row+1,board,result);
			}
		}
		
	}
	
	public static boolean checkBoard(int row,int column, int[] board){
		for (int i=0; i<row; i++){
			if (column == board[i]) return false;
			
			int rowDist = row - i;
			int colDist = Math.abs(column-board[i]);
			if (rowDist == colDist) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int[]ele:eightQueen()){
			System.out.println(Arrays.toString(ele));
		}
	}

}
