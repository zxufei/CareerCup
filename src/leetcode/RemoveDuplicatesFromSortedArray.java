package leetcode;

public class RemoveDuplicatesFromSortedArray {

	/**
	 * @param args
	 * Given a sorted array, remove the duplicates in place such 
	 * that each element appear only once and return the new length.
Do not allocate extra space for another array, you must do this in place with constant memory.
For example,
Given input array A = [1,1,2],
Your function should return length = 2, and A is now [1,2].
	 */
	
	//idea: record non duplicate integers and assign to new index
	public int removeDuplicates(int[] A) {
	        // IMPORTANT: Please reset any member data you declared, as
	        // the same Solution instance will be reused for each test case.
	        if(A.length ==0) return 0;
	        int new_index = 0;
	        for (int i=0; i<A.length; i++){
	            if (A[i] != A[new_index]){
	                new_index++;
	                A[new_index] = A[i];
	            }
	        }
	        return new_index+1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
