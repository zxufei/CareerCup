package leetcode;

public class NQueensII {

	/**
	 * @param args
	 * Follow up for N-Queens problem.
Now, instead outputting board configurations, 
return the total number of distinct solutions.
	 */
	
	//param: n number of queen problem
	//return: not keep data of every results just return how many possible results.
	private static int count = 0;
	
    public static int totalNQueens(int n) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        int[] board =  new int[n];
        queen(n,0,board);
        return count;
    }
    
    
    public static boolean queen(int n, int row, int[] board){
        if (row == n) return true;//0~n-1 is ok.
        
        for (int i=0; i<n; i++){
            if (checkBoard(row,i,board)){
                board[row] = i;
                if(queen(n,row+1,board)){
                    count++;
                }
            }
        }
        return false;
    }
    
    public static boolean checkBoard(int row, int col, int[]board){
        for(int i=0; i<row; i++){
            if(board[i] ==  col) return false;
            if ( Math.abs(board[i]-col) == Math.abs(row-i)) return false;
        }
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(totalNQueens(8));
	}

}
