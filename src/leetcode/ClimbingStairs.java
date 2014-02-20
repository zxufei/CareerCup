package leetcode;

public class ClimbingStairs {

	/**
	 * @param args
	 * You are climbing a stair case. It takes n steps to reach to the top.
		Each time you can either climb 1 or 2 steps. 
		In how many distinct ways can you climb to the top?
	 */
	//non-recursion like fibonacci.
	 public static int climbStairs(int n) {
	        // IMPORTANT: Please reset any member data you declared, as
	        // the same Solution instance will be reused for each test case.
	        int a = 1, b=2, c=0;
	        if (n ==1 ) return 1;
	        if (n == 2) return 2;
	        for (int i=2; i< n; i++){
	            c = a + b;
	            a = b;
	            b = c;
	        }
	        return c;
	    }
	 
	 //recursion method
	public static int climbStairs2(int n){
		if (n < 0) return 0;
		else if (n == 0) return 1;
		else return climbStairs2(n-1) + climbStairs2(n-2);
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(climbStairs2(38));
	}

}
