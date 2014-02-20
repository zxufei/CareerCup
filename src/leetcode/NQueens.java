package leetcode;
import java.util.*;
public class NQueens {

	/**
	 * @param args
	 */
	
	//param:n is the number of queen problem
	//return: Every possible results are saved in arraylist, every results is a int[n] array
	//with every elements is col no. according to specific row index.
	public static ArrayList<String[]> solveNQueens(int n) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        ArrayList<int[]>result = new ArrayList<int[]>();
        ArrayList<String[]> resultP = new ArrayList<String[]>();
        int[] board = new int[n];
        queen(n,0,board,result);
        storeQueen(result,resultP);
        return resultP;
        
    }
    
    public static void queen(int n,int row, int[] board, ArrayList<int[]>result){
        if (row == n){
            result.add(board.clone());
        }
        else{
	        for (int i=0; i<n; i++){
	            if (checkBoard(row,i,board)){
	                board[row] = i;
	                queen(n,row+1,board,result);
	            }
	        }
        }
    }
    
    public static boolean checkBoard(int row, int column, int[] board){
        for (int i=0; i<row; i++){
            if (board[i] == column) return false;
            int rowDist = row - i;
            int colDist = Math.abs(board[i]-column);
            if (rowDist == colDist) return false;
        }
        return true;
    }
    
    public static void storeQueen(ArrayList<int[]> result,ArrayList<String[]> s){
        for (int[] ele:result){
            String[] oneResult = new String[ele.length];
            for (int i=0; i<ele.length; i++){
               char[] c = new char[ele.length];
               for(int j=0 ; j<c.length; j++){
                   if (j == ele[i]) c[j] = 'Q';
                   else c[j] ='.';
               }
               oneResult[i] = String.valueOf(c);
            }
            s.add(oneResult);
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String[]> result = new ArrayList<String[]>();
		result = solveNQueens(8);
		for (String[] oneR :result){
			System.out.println(Arrays.toString(oneR));
		}
	}

}
