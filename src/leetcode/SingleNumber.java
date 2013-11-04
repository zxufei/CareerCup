package leetcode;

public class SingleNumber {

	/**
	 * @param args
		Given an array of integers, every element appears twice except for one. Find that single one.
		Note:
		Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
		http://discuss.leetcode.com/questions/917/number-which-appear-exactly-once
	 */
	
	//only valid for positive number;+10000 number can be negative;
	public static int singleNumber(int[] array){
		boolean [] bitfound = new boolean[250000];
		boolean [] bitduplicate = new boolean[250000];
		for (int i=0; i<array.length; i++){
			if (bitfound[array[i]+10000]) bitduplicate[array[i]+10000] = true;
			else bitfound[array[i]+10000] = true;
		}
		
		for (int i=0; i<array.length; i++){
			if (bitfound[array[i]+10000]== true && bitduplicate[array[i]+10000] == false){
				return array[i];
			}
		}
		return -1;
	}
	
	//xor process for quic O(N) find
	//only can be done if other appear twice and one single number
	public static int singleNumber2(int[] A){
		int xor = 0;
		for (int i=0; i<A.length; i++){
			xor = xor ^ A[i];
		}
		return xor;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {1,1,5,5,2};
		System.out.print(singleNumber2(A));
	}

}
