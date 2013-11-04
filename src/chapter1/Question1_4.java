package chapter1;
/**	4th
 *  Write a method to replace all spaces in a string with Ô%20Õ
 *  5th
 *  Write a method to replace all spaces in a string with'%20'. You may
 *  assume that the string has sufficient spaces at the hold the additional
 *  characters, and that you are given the "true" length of the string.(Note:if
 *  implementing in java, please use a character array so that you can perform
 *  this operation in place.)
 *  Example
 *  Input: "Mr John Smith      "
 *  Output:"Mr%20John%20Smith"
 */

public class Question1_4 {
	
//	Use char character
	public static String replaceSpace(String str){
		String str_trim = str.trim();//get rid of spaces at the head and tail
		char[] chars_trim = str_trim.toCharArray();
		int spaceCount = 0;
		for (int i = 0; i<str_trim.length(); i++){
			if (chars_trim[i] == ' ') spaceCount++;
		}		
		int spacesIndex = 0;
		char[] newchars = new char[str_trim.length()+spaceCount*2];
		for (int i = 0; i<str_trim.length(); i++){
			if (chars_trim[i]!=' '){
				newchars[spacesIndex] = chars_trim[i];
				spacesIndex++;
			}
			else{
//				newchars[spacesIndex] = '%';
//				newchars[spacesIndex+1] = '2';
//				newchars[spacesIndex+2] = '0';
//				spacesIndex = spacesIndex +3;	
				newchars[spacesIndex++] = '%';
				newchars[spacesIndex++] = '2';
				newchars[spacesIndex++] = '0';
			}
		}
		return new String(newchars);		
	}
	
	
	public static void main (String args[]){
		String s = "Mr John Smith is good person. we like him very much.     ";
		String s2 = replaceSpace(s);
		System.out.println(s);
		System.out.println(s2);
	}
}
