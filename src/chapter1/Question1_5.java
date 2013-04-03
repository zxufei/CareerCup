package chapter1;
/** 4th
 * Design an algorithm and write code to remove the duplicate characters in a string 
 * without using any additional buffer
 * NOTE: One or two additional variables are fine
 * An extra copy of the array is not allowed 
 * FOLLOW UP
 * Write the test cases for this method
 * 
 * 5th
 * Implement a method to perform basic string compression using the counts
 * of repeated characters. For example, the string aabcccccaaa would become
 * a2b1c5a3. if the "compressed" string would not become smaller than the
 * original string, your method should return the original string.
 */

public class Question1_5 {
	public static String compressed(String str){
		StringBuffer newstr = new StringBuffer();//StringBuilder
		char current = ' ';
		char prev=' ';
		int count =1;
		for (int i = 0; i< str.length()-1; i++){
			prev = str.charAt(i);
			current = str.charAt(i+1);
			
			if ( prev != current){
				newstr.append(prev);
				newstr.append(count);
				count = 1;
			}
			else
				count++;	
		}	
		//add last character
		newstr.append(current);
		newstr.append(count);
		
		if (newstr.toString().length() > str.length()) return str;
		else return newstr.toString();
	}
	
	
	public static void main(String args[]){
		String test = "aabcccccaaa";
		String test2 = "abcdddddfffffesfffff";
		String output = compressed(test);
		String output2 = compressed(test2);
		System.out.println(output);
		System.out.println(output2);
		
	}
}
