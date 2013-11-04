package Interview;

public class Palindrome {

	/**
	 * @param args
	 * Test whether a given String is a Palindrome or not
	 */
	
	//start and end compare
	public static boolean isPalindrome1(String str){
		char[] cstr = str.toCharArray();
		for (int i =0; i<str.length()/2; i++){
			if(cstr[i] != cstr[str.length()-1-i])
				return false;
			//else continue;
		}
		return true;
	}
	
	public static boolean isPalindrome2(String str){
		int left = 0;
		int right = str.length()-1;
		while(left<right){
			if(str.charAt(left)!=str.charAt(right))
				return false;
			left++;
			right--;
		}
		return true;
	}
	
	//built-in function
	public static boolean isPalindrome3(String str){
		String reverse= new StringBuilder(str).reverse().toString();
		return str.equals(reverse);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input = {
		         "abcdefg",
		         "abccba",
		         "abcba",
		         "hannah",
		         "array",
		         "java",
		         "abccca"
		      };
		       
		      // Loop through an array of Strings,
		      // testing if each is a Palindrome or not
		       
		      for (int i=0; i<input.length; i++) {
		          
		         // Test if next string is a palindrome
		          
		         boolean palindrome = isPalindrome3(input[i]);
		         if (palindrome) {
		            System.out.println(input[i]+" is a palindrome");
		         } else {
		            System.out.println(input[i]+" is not a palindrome");           
		         }
		      }
	}
}
