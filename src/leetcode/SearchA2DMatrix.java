package leetcode;
import java.util.*;

public class SearchA2DMatrix {

	/**
	 * @param args
	 * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
	 Integers in each row are sorted from left to right.
	 The first integer of each row is greater than the last integer of the previous row.
	 For example,
	 Consider the following matrix:
	 [
  		[1,   3,  5,  7],
  		[10, 11, 16, 20],
  		[23, 30, 34, 50]
	 ]
	 Given target = 3, return true.
	 */
	
	//method 1
	public static boolean searchMatrix(int[][]matrix, int target){
	        // Note: The Solution object is instantiated only once and is reused by each test case.
	        HashSet<Integer> set = new HashSet<Integer>();
	        for (int i=0; i<matrix.length; i++){
	            for(int j=0; j<matrix[i].length; j++){
	                set.add(matrix[i][j]);
	            }
	        }
	        return set.contains(target);
	}
	
	//method 2
	public static boolean searchMatrix2(int[][]matrix, int target){
		int recordRow = 0;
		if(matrix.length==0|| matrix[0].length==0) return false;
		else if (matrix.length==1) return searchRowGeneral(matrix[0],target);
		
		for (int i=0; i<matrix.length; i++){
			if(matrix[i][0]==target) return true;
			else if(matrix[i][0]>target) {
				recordRow = i;
				break;
			}
			else recordRow = i+1;//search last row of matrix
		}
		if (recordRow ==0) return false;
		else {
			recordRow--;
			return searchRowGeneral(matrix[recordRow],target);
		}
		
	}
	
	public static boolean searchRowGeneral (int[] row, int target ){
		for(int i=0; i<row.length; i++){
			if (row[i] == target) return true;
		}
		return false;
	}
	
	//binary search, sorted row
//	public static boolean searchRow(int[] row, int target){
//		while()
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
