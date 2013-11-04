package chapter1;
/**5th
Assume you have a method isSubstring which checks if one word is a substring of another. 
Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one 
call to isSubstring (e.g., "waterbottle" is a rotation of "erbottlewat").
*/

public class Question1_8 {
	public static boolean isRotation(String s1, String s2){
		if (s1.length() != s2.length()) return false;
//		StringBuffer s = new StringBuffer(s1+s1);
//		String str = s.toString();		
		return isSubstring(s1+s1,s2);
	}
	
	public static boolean isSubstring(String s1, String s2){
		return s1.matches("\\w*"+s2+"\\w*") || s2.matches("\\w*"+s1+"\\w*");
		//"\\w*"means a string: \w*
				
	}
	
//	public static boolean isSubstring2(String s1, String s2){
//		if(s1.length() != s2.length()) return false;
//		return true;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s2 = "headquarter";
		String s1 = "arterheadqu";
		boolean flag = isRotation(s1,s2);
		System.out.println(flag);
	}

}
