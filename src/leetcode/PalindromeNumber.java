package leetcode;

public class PalindromeNumber {

	/**
	 * @param args
		Determine whether an integer is a palindrome. Do this without extra space.
		click to show spoilers.
		
		Some hints:
		Could negative integers be palindromes? (ie, -1)
		If you are thinking of converting the integer to string, note the restriction of using extra space.
		You could also try reversing an integer. However, 
		if you have solved the problem "Reverse Integer", 
		you know that the reversed integer might overflow. 
		How would you handle such case?
		There is a more generic way of solving this problem.
		http://leetcode.com/2012/01/palindrome-number.html
	 */
	
	//extra space for c。a must be positive integer.
	public static int reverseNum(int a){
		int c = 0;
		while (a > 0){
			c = c*10 + a%10;
			a = a/10;	
		}
		return c;
	}
	
	public static boolean isPalindrome(int a){
		return a == reverseNum(a);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1394931;
		System.out.println(isPalindrome(a));
	}

}
