package Interview;

import java.util.Arrays;

public class FindPair {

	/**amazon interview4
	 * @param args
	 * input [4,3,2,5,7,0,8],7
	 * output[4,3,2,5,7,0]
	 */
	public static int[] findPair(int[] array, int sum){
		Arrays.sort(array);
		int[] result = new int[array.length];
		int j=0;
		int head = 0, tail = array.length-1;
		while(head < tail){
			if ((array[head] + array[tail]) < sum ){
				head ++;
			}else if ((array[head]+array[tail]) > sum){
				tail--;
			}
			else{
				result[j++] = array[head];
				result[j++] = array[tail];
				head++;
				tail--;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A ={4,3,2,5,7,0,8,4,9};
		int[] B = findPair(A,8);
		for(int i=0; i<B.length; i++){
			System.out.print(B[i]+" ");
		}
	}

}

