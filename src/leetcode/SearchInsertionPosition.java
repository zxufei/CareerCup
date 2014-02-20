package leetcode;

public class SearchInsertionPosition {

	/**
	 * @param args
	 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Here are few examples.
[1,3,5,6], 5 → 2
[1,3,5,6], 2 → 1
[1,3,5,6], 7 → 4
[1,3,5,6], 0 → 0
	 */
	 public int searchInsert(int[] A, int target) {
	        // IMPORTANT: Please reset any member data you declared, as
	        // the same Solution instance will be reused for each test case.
	        for (int i=0; i<A.length; i++){
	            if (A[i] == target) return i;
	            else if (A[i] > target) return i;
	        }
	        return A.length;
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
