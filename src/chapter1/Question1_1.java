package chapter1;

import java.util.Arrays;

/** Question1.1:
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you can not use additional data structures?
 */
public class Question1_1 {
//	8-bit encoding of ASCII (American Standard Coding for Information Interchange). 
//	ASCII only defines the first 128 characters, 
//	and the other 128 values are often used for various extensions.
//	unicode is 16bit (2bytes)UTF16 65536, 50000 defined unicode characters
	
	//	two for loop O(n^2)
	public static boolean isUniqueChar1(String str){
		if (str.length() > 256) return false;
		for (int i=0; i<str.length(); i++){
			for(int j =i+1; j< str.length(); j++){
				if (str.charAt(i)==str.charAt(j))
					return false;
			}
		}
		return true;
	}
	
	//sort the array of char and one for loop. O(n)
	public static boolean isUniqueChar2(String str){
		if (str.length() > 256) return false;
		char [] charArray = str.toCharArray();
		Arrays.sort(charArray);//O(nlog(n))
		for (int i = 0; i < charArray.length-1; i++){
			if(charArray[i]==charArray[i+1])
				return false;
		}
		return true;
		
	}
	
	//boolean map O(n)
	public static boolean isUniqueChar3(String str){
		if (str.length() > 256) return false;
		boolean[] map = new boolean[256];//all map is false, additional buffer but not data structure
		for (int i = 0; i< str.length(); i++){
			char c = str.charAt(i);
//			System.out.print(c);
//			System.out.println(Character.getNumericValue(c));
			if (map[c]) return false;
			else map[c]=true;
		}
		return true;
	}
	
//	bitwise method
	
//	test	
	public static void main (String arg[]){
		String[] strs = { "asdfghjklASDFGHJKL!@#$%^&*()",
				"asdfghjklqwertyuiopf", "", "~!@#$%^&*()_+ASDFGHJKL;" };
		for (String str : strs)
			System.out.println(isUniqueChar1(str));
		System.out.println();
		for (String str : strs)
			System.out.println(isUniqueChar2(str));
		System.out.println();
		
		String[] strs2 = { "asdfghjkl", "asdfghjklqwertyuiopf", ""};
		for (String str : strs2)
			System.out.println(isUniqueChar3(str));
	}
}
