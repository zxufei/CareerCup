package chapter1;
/**5th
 * Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, 
 * write a method to rotate the image by 90 degrees. Can you do this in place?
 * 4th
 * Given an image represented by an NxN matrix, 
 * where each pixel in the image is 4 bytes, 
 * write a method to rotate the image by 90 degrees
 * Can you do this in place?
 *
 * @author xufeizhao
 *
 */

public class Question1_6 {
	public static int[][] rotation (int[][] matrix){
		int N = matrix.length;
		
		for (int i =0; i< N; i++){
			if (matrix[i].length!=N){
				System.out.println("Must be NxN matrix!");
				return null;
			}
		}
		
		int temp = 0;
		for (int i =0; i<N/2; i++){
			for (int j =i; j< N-1-i; j++){
				temp = matrix[i][j];
				matrix[i][j] = matrix[j][N-1-i];
				matrix[j][N-1-i] = matrix[N-1-i][N-1-j];
				matrix[N-1-i][N-1-j]=matrix[N-1-j][i];
				matrix[N-1-j][i] = temp;
			}
		}
		
		return matrix;	
	}
	
	public static void print(int[][] matrix){
		for (int i=0;i< matrix.length; i++){
			for(int j =0; j<matrix[i].length; j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] image = {{0,1,2,3,4},{0,1,2,3,4},{0,1,2,3,4},{0,1,2,3,4},{0,1,2,3,4}};
		print(image);
		System.out.println();
		image = rotation(image);
		print(image);
		
	}

}
