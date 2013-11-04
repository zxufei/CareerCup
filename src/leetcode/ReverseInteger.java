package leetcode;

public class ReverseInteger {

	/**
	 * @param args
	Reverse digits of an integer.
	
	Example1: x = 123, return 321
	Example2: x = -123, return -321
	
	click to show spoilers.
	Have you thought about this?
	Here are some good questions to ask before coding. 
	Bonus points for you if you have already thought through this!
	
	If the integer's last digit is 0, what should the output be? ie, cases such as 10, 100.
	
	Did you notice that the reversed integer might overflow? Assume the input is a 32-bit integer, 
	then the reverse of 1000000003 overflows. How should you handle such cases?
	
	Throw an exception? Good, but what if throwing an exception is not an option? 
	You would then have to re-design the function (ie, add an extra parameter).
	 */
	
	//If it overflows, it goes back to the minimum value and continues from there. 
	//If it underflows, it goes back to the maximum value and continues from there.
	//handle overflow
	public static boolean willAdditionOverflow(int left, int right) {
	    if (right < 0 && right != Integer.MIN_VALUE) {
	        return willSubtractionOverflow(left, -right);
	    } else {
	        return (~(left ^ right) & (left ^ (left + right))) < 0;
	    }
	}

	public static boolean willSubtractionOverflow(int left, int right) {
	    if (right < 0) {
	        return willAdditionOverflow(left, -right);
	    } else {
	        return ((left ^ right) & (left ^ (left - right))) < 0;
	    }
	}
	
	public static int reverse(int x) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
		
        int  a=0,b=0;
        if (x < 0){
             a = -x;
        }
        else a = x;
        
        while(a > 0){
        	if (willAdditionOverflow(b*10,a%10)) return -1;
            b = b*10 + a%10;
            a /= 10;
        }
        if (x < 0) b = -b;
        return b;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2000000003;
		System.out.print(reverse(a));
	}

}
