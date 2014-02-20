package leetcode;

public class SortColors {

	/**
	 * Given an array with n objects colored red, white or blue, 
	 * sort them so that objects of the same color are adjacent,
	 * with the colors in the order red, white and blue.
Here, we will use the integers 0, 1, and 2 to represent the color red, 
white, and blue respectively.

Note:
You are not suppose to use the library's sort function for this problem.

click to show follow up.

Follow up:
A rather straight forward solution is a two-pass algorithm using counting sort.
First, iterate the array counting number of 0's, 1's, and 2's,
 then overwrite array with total number of 0's, then 1's and followed by 2's.

Could you come up with an one-pass algorithm using only constant space?
	 */
	//three index approach.
    public void sortColors2(int[] A) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        //counting sort
        int f = 0;//next index of last index of 0
        int s = A.length;//first index of 2
        int i = 0;//iterator
        while (i < s){
            if (A[i] == 0){
                swap(A,i,f);
                i++;//i>=f
                f++;
            }
            else if (A[i] == 1){
                i++;
            }
            else{
                s--;
                swap(A,i,s);
            }
        }
    }
    
    public void swap(int[] A, int i, int j){
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }
	
	
	//counting sort! not very effciency.
    public void sortColors(int[] A) {
        //counting sort
        int r = 0, w = 0, b = 0;
        for (int i=0; i<A.length; i++){
            if (A[i] == 0) r++;
            else if (A[i] == 1) w++;
            else b++;
        }
        int j = 0;
        while (j < A.length){
            while (r > 0){
                A[j++] = 0;
                r--;
            }
            while (w > 0){
                A[j++] = 1;
                w--;
            }
            while (b > 0){
                A[j++] = 2;
                b--;
            }
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
