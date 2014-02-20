package leetcode;

public class MaximumSubarray {

	/**
	 * @param args
	 * Find the contiguous subarray within an array (containing at least one number)
	 *  which has the largest sum.
For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
the contiguous subarray [4,−1,2,1] has the largest sum = 6.
http://fisherlei.blogspot.com/2012/12/leetcode-maximum-subarray.html
	 */
	
	//1-dimension dp.O(N)
    public int maxSubArray(int[] A) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        if (A.length == 0) return 0;
        int sum =0, max = Integer.MIN_VALUE;
        for (int i=0; i<A.length; i++){
            sum += A[i];
            if (sum > max) max = sum;
            if (sum < 0) sum = 0;
        }
        return max;
    }
    
    //divide and conquer
    public int maxSubArray2(int[] A) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        return maxSub(A,0,A.length-1,Integer.MIN_VALUE);
    }
    
    public int maxSub(int []A, int left, int right, int max){
        if (left > right) return Integer.MIN_VALUE;
        int middle = (left + right)/2;
        int leftMax = maxSub(A,left,middle-1,max);
        int rightMax = maxSub(A,middle+1, right, max);
        max = Math.max(leftMax, max);
        max = Math.max(rightMax, max);
        
        int sum =0, mlmax = 0;
        for (int i=middle-1; i>=left; i--){
            sum +=A[i];
            if (sum > mlmax) mlmax = sum;
        }
        
        sum =0; int mrmax = 0;
        for (int i=middle+1; i<=right; i++){
            sum+=A[i];
            if (sum > mrmax) mrmax = sum;
        }
        
        max = Math.max(max, mlmax+mrmax+A[middle]);
        return max;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
