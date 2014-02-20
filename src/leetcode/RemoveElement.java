package leetcode;

import java.util.Arrays;

public class RemoveElement {

	/**
	 * @param args
	 * Given an array and a value, remove all instances of that value in place and return the new length.
The order of elements can be changed. It doesn't matter what you leave beyond the new length.
	 */
    public int removeElement(int[] A, int elem) {
        Arrays.sort(A);
        int count = 0,start = -1;
        int end = -1;
        for (int i=0; i<A.length; i++){
            if (A[i]==elem){
                end = i + 1;//record next index to the last element to be removed.
                count ++;
            }
        }
        if (count == 0) return A.length;
        
        start = end - count;//the start index to be removed.
        while (end<A.length){
            A[start++] = A[end++];
        }
        return A.length-count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
