package chapter1;

import java.util.*;
import chapter1.Question1_6;
/**5th
 * Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.
 * @author xufeizhao
 * 4th
 * Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.
 */

public class Question1_7 {

	public static int[][] setZeros(int[][] matrix){
		LinkedHashSet<Integer> row = new LinkedHashSet<Integer>();
		LinkedHashSet<Integer> col = new LinkedHashSet<Integer>();
		for (int i =0; i<matrix.length; i++){
			for(int j = 0; j<matrix[i].length; j++){
				if(matrix[i][j] == 0){
					row.add(i);
					col.add(j);
				}
			}
		}
		
		for (int i : row){
			for (int j =0; j<matrix[i].length; j++){
				matrix[i][j]=0;
			}
		}
		
		for(int j : col){
			for (int i =0; i<matrix.length; i++){
				matrix[i][j]=0;
			}
		}
		return matrix;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] image = {{0,1,2,3,4},{1,1,2,3,4},{1,1,2,3,4},{1,1,2,3,4},{1,1,2,3,0},{3,4,5,6,8}};
		Question1_6.print(image);//use the print function written in Question1_6.java
		System.out.println();
		image = setZeros(image);
		Question1_6.print(image);
	}

}
