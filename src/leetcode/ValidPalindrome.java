package leetcode;

public class ValidPalindrome {

	/**
	 * @param arg
		Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
		
		For example,
		"A man, a plan, a canal: Panama" is a palindrome.
		"race a car" is not a palindrome.
		
		Note:
		Have you consider that the string might be empty? This is a good question to ask during an interview.
		
		For the purpose of this problem, we define empty string as valid palindrome.
	 */
	
	public static boolean isPalindrome(String s) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
		s = preTreatString(s);
		for (int i=0; i<s.length()/2; i++){
			if (s.charAt(i) != s.charAt(s.length()-1-i)){
				return false;
			}
		}
		return true;
        
    }
	
	public static String preTreatString(String s){
		StringBuffer buffer = new StringBuffer();
		s = s.toLowerCase();
		for (int i=0; i<s.length(); i++){
			if ((s.charAt(i) >= '0' && s.charAt(i) <='9') || (s.charAt(i) >='a' && s.charAt(i) <= 'z')){
				buffer.append(s.charAt(i));
			}
		}
		return buffer.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "A man, a plan, a canal: Panama";
		System.out.print(isPalindrome(s));
	}

}
